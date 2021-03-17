import java.util.HashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//подключиться к БД в этом классе.
public class Credential {
    private static ConcurrentHashMap<String, char[]> credentials = new ConcurrentHashMap<>();
    static{
        //захардкодим тестовые логин или пароль.
        credentials.put("aaa", "aaa".toCharArray());
    }


    public Credential(String name, String password){
        credentials.put(name, password.toCharArray());
    }

    public static boolean isCredentialValid(String name, String password){
        if(name == null || password == null) return false;

        for(Map.Entry<String, char[]> pair : credentials.entrySet()){
            String userName = pair.getKey();
            String userPassword = null;
            if(userName.equals(name)){
                userPassword = new String(pair.getValue());
            }
            return password.equals(userPassword);
        }
        return false;
    }

}
