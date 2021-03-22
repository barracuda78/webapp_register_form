import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        ApplicationParameters.create(getServletContext());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String imagePath = ApplicationParameters.getPathToImage();

        response.setContentType("text/html; charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String clear = request.getParameter("clear");

            if (userName == null || password == null) {
                out.println("<h1> возможно вы не ввели логин или пароль. </h1>");
                out.println("<h1><a href=\"webAppTest_war_exploded/index.jsp\">Попробовать ввести логин/пароль еще раз</a></h1>");
                return;
            }

            userName = userName.trim();
            password = password.trim();

            //если нажал очистить - делаю редирект на главную страницу - там поля уже очищены.
            if (clear != null) { //&& clear.equals("Очистить")
                //здесь редирект
                response.sendRedirect("index.jsp");
            }

            if(Credential.isCredentialValid(userName, password)){
                //пускаем пользователя
                out.println("<img src=\"imagePath\">");
                out.println("<h1> Пользователь ввел корректные логин и пароль!</h1>");
            } else {
                //не пускаем пользователя
                out.println("<h1> НЕПРАВИЛЬНЫЙ ЛОГИН ИЛИ ПАРОЛЬ!!!</h1>");
            }
            out.println("<h1><a href=\"index.jsp\">вернуться на страницу входа</a></h1>");
        }

    }

}
