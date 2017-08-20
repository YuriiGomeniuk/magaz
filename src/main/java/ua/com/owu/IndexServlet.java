package ua.com.owu;

import ua.com.owu.db.MyDBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "IndexServlet")
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String userName = request.getParameter( "username" );
        System.out.println("user name 1s " +userName);
        MyDBConnection myDBConnection = new MyDBConnection();
        myDBConnection.saveUser( userName );
        request.getRequestDispatcher( "/WEB-INF/pages/welcome.jsp" ).forward( request, response );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("IndexServlet");
        request.setAttribute( "myKay", "my value" );
        request.getRequestDispatcher( "/WEB-INF/pages/index.jsp" ).forward( request, response );
    }
}
