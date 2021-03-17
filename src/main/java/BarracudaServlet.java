import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BarracudaServlet", value = "/andrey")
public class BarracudaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Привет, Андрей! </h1>");
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Lab1</title>");
            //ДОБАВКА:
                out.println("<style>");
                    out.println("body{background-color: #AAAAFF;}");
                        out.println("#box{");
                            out.println("position: absolute;");
                            out.println("top: 50%;");
                            out.println("left: 50%;");
                            out.println("margin: -75px 0px 0px -193px;");
                            out.println("padding: 10px;");

                            out.println("width: 360px;");
                            out.println("height: 150px;");

                            out.println("border: dotted blue 1px;");
                        out.println("}");
                    out.println("td{");
                        out.println("text-align:center;");
                    out.println("}");
                out.println("</style>");
            //КОНЕЦ ДОБАВКИ.
            out.println("</head>");
        out.println("<body>");
        out.println("<h1>This is Andrey Ruzaev.</h1>");
        out.println("<h2>This is cyrillic: кириллица.</h2>");
        out.println("</body></html>");
    }
}
