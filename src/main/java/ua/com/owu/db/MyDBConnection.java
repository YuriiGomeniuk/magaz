package ua.com.owu.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyDBConnection {
    String url = "jdbc:mysql://localhost/test";
    String user = "root";
    String password = "root";
    Connection connection;

    public MyDBConnection() {
        try {
            this.connection  = DriverManager.getConnection( url, user, password );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void saveUser(String userName) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement( "INSERT INTO USER (NAME) VALUES ('"+userName+"')");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<String> select () {
            List<String> strings = new ArrayList<String>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement( "SELECT * FROM USER" );
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString( 1 );
                String userName = resultSet.getString( 2 );
                String user = id + " " + userName;
                strings.add( user );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return strings;
    }

}
