package ua.com.owu;

import ua.com.owu.config.MyDBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AllServlet")
public class AllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        MyDBConnection myDBConnection = new MyDBConnection();
        List<String> strings = myDBConnection.select();
        request.setAttribute( "allUsers" , strings );
        request.getRequestDispatcher( "/WEB-INF/pages/all.jsp" ).forward( request, response );
    }
}
