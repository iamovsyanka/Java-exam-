package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private final DBConnection dbConnection = new DBConnection();

    public boolean checkUser(String login, String password) throws SQLException {
        Connection connection = dbConnection.createConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT Password FROM users WHERE Name='" + login + "'");
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            int retrievedPassword = resultSet.getInt(1);
            if (retrievedPassword == password.hashCode()) {
                return true;
            }
        }
        return false;
    }

    public void addUser(String login, String password) throws SQLException {
        String query = " INSERT INTO users(Name, Password) VALUES (?, ?)";
        Connection connection = dbConnection.createConnection();
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, login);
        statement.setInt(2, password.hashCode());
        statement.executeUpdate();
    }
}
