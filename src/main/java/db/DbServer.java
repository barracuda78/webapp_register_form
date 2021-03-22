package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;
import java.util.Properties;

public class DbServer {
    public static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static String USER = "postgres";
    private static String PASSWORD = "Fsdledmow11aug1978";
    private static String QUERY;

    private Connection connection;
    private PreparedStatement pst;

    //инициализация полей в конструкторе значениями из файла database.properties: лежит в пакете resources
    public DbServer(){

        connection = Connector.getConnection();
//        Properties properties = Connector.getProperties();
//
//        for(Map.Entry<Object, Object> pair : properties.entrySet()){
//            String key = (String)pair.getKey();
//            String value = (String)pair.getValue();
//
//            if(key.equals("url")){
//                URL = value;
//            }else if(key.equals("user")){
//                USER = value;
//            }else if(key.equals("password")){
//                PASSWORD = value;
//            }
//            //проверка:
//            System.out.println(key + " : " + value);
//        }
    }

    public static void main(String[] args) {
        new DbServer();
    }
}
