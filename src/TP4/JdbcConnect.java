package TP4;
import java.sql.*;

public class JdbcConnect {
   public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        String url = "jdbc:mysql://127.0.0.1:3306/login";
        String login = "root";
        String passwd = "root";
        Connection cn = null;
        try {
            cn = DriverManager.getConnection(url, login, passwd);
            System.out.println("Connected to database.");

            // Create a table named 'users' if it doesn't exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "username VARCHAR(50) NOT NULL," +
                    "password VARCHAR(50) NOT NULL)";
            Statement statement = cn.createStatement();
            statement.execute(createTableSQL);
            System.out.println("Table 'users' created successfully.");

            // For demonstration purposes, I'll directly provide input here
            int choice = 3; // Change this value to choose the action: 1 - Add user, 2 - Delete user, 3 - Update user

            switch (choice) {
                case 1: // Add user
                    String addUsername = "sami";
                    String addPassword = "sami132";
                    String insertUserSQL = "INSERT INTO users (username, password) VALUES (?, ?)";
                    PreparedStatement addUserStatement = cn.prepareStatement(insertUserSQL);
                    addUserStatement.setString(1, addUsername);
                    addUserStatement.setString(2, addPassword);
                    addUserStatement.executeUpdate();
                    System.out.println("User added successfully.");
                    break;

                case 2: // Delete user
                    int deleteUserId = 1; // Change this value to the ID of the user you want to delete
                    String deleteUserSQL = "DELETE FROM users WHERE id = ?";
                    PreparedStatement deleteUserStatement = cn.prepareStatement(deleteUserSQL);
                    deleteUserStatement.setInt(1, deleteUserId);
                    int deletedRows = deleteUserStatement.executeUpdate();
                    if (deletedRows > 0) {
                        System.out.println("User deleted successfully.");
                    } else {
                        System.out.println("User not found or deletion failed.");
                    }
                    break;

                case 3: // Update user
                    int updateUserId = 1; // Change this value to the ID of the user you want to update
                    String newUsername = "sami";
                    String newPassword = "sami123";
                    String updateUserSQL = "UPDATE users SET username = ?, password = ? WHERE id = ?";
                    PreparedStatement updateUserStatement = cn.prepareStatement(updateUserSQL);
                    updateUserStatement.setString(1, newUsername);
                    updateUserStatement.setString(2, newPassword);
                    updateUserStatement.setInt(3, 5);
                    int updatedRows = updateUserStatement.executeUpdate();
                    if (updatedRows > 0) {
                        System.out.println("User updated successfully.");
                    } else {
                        System.out.println("User not found or update failed.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

