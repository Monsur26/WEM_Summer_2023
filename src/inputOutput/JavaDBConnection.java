package inputOutput;

import java.sql.*;

public class JavaDBConnection {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;


        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pnt", "root", "System26");

            // Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT first_name, last_name, email FROM employees where first_name='Steven'";
            ResultSet rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                // Retrieve by column name
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String  email = rs.getString("email");

                // Display values

                System.out.print("FirstName: \n" + first_name);
                System.out.print(", \nLastName: \n" + last_name);
                System.out.print(", \nEmail:" + email);

                System.out.println("\n------------------------------------------------------------------");
            }

            // Insert a record
            System.out.println("Inserting a record...");
            sql = "INSERT INTO dummy_data (first_name, last_name,email,password)" +
                    " VALUES ('Nabil', 'Tahmid', 'NB@email,com','TodayisAluckyDay')";


            stmt.executeUpdate(sql);
            System.out.println("Record inserted successfully.");

            // Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
    }

