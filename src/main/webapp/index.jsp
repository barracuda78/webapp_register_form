<%@ page import="java.io.FileWriter" %>
<%@ page import="java.io.BufferedWriter" %>
<%@ page import="java.io.File" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>barracuda</title>
    <style>
        body{
            background-color: #AAFFAA;
        }
        #box{
            position: absolute;<%--абсолютное позиционирование--%>
            top: 50%; <%--смещение верх лев угла--%>
            left: 50%;
            margin: -75px 0px 0px -193px; <%--отступ верх право низ лево--%>
            padding: 10px;

            width: 360px;
            height: 150px;

            border: dotted blue 1px;
        }
        td{
            text-align:center;
        }

    </style>
</head>
    <body>
        <!--img src=”logo.jpg” alt="header" width="1693" height="183"-->
        <img src=”https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png”>
        <h1><%= "Добрый день!" %></h1>
        <br/>
        <a href="https://eforward.ru/">на главную</a>
        <br/>
        <a href="andrey">barracuda servlet from jsp file</a>
        <br/>
        <a href="hello-servlet">hello servlet from jsp file</a>

        <div id="box">
            <form name="add" action="RegisterServlet" method="GET">
                <table>         <%--таблица--%>
                    <tr>        <%--table raw--%>
                        <td><input type="text" name="userName" size="12"/></td>
                        <td><input type="text" name="password" size="12"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="enter" value="Войти"/></td>
                        <td><input type="submit" name="clear" value="Очистить"/></td>
                    </tr>

                </table>
            </form>
            
            <%
                BufferedWriter bf = new BufferedWriter(new FileWriter(new File("test.txt")));
                bf.write("testing string");
                bf.flush();
                bf.close();
            %>
<%--            <form name="mult" action="Calc" method="POST">--%>
<%--                <table>         &lt;%&ndash;таблица&ndash;%&gt;--%>
<%--                    <tr>        &lt;%&ndash;table raw&ndash;%&gt;--%>
<%--                        <td><input type="text" name="n3" size="12"/></td>--%>
<%--                        <td><input type="text" name="n4" size="12"/></td>--%>
<%--                    </tr>--%>
<%--                    <tr>--%>
<%--                        <td><input type="submit" name="b3" value="Умножить"/></td>--%>
<%--                        <td><input type="submit" name="b4" value="Очистить"/></td>--%>
<%--                    </tr>--%>

<%--                </table>--%>
<%--            </form>--%>
            <!--ТЕКСТ КАКОЙ-ТО-->
        </div>
    </body>
</html>