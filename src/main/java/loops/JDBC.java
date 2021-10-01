package loops;

import java.sql.*;

public class JDBC {


    public static void main(String[] args) {

  String url = "jdbc:mysql://127.0.0.1:3306/employee_database";

        try {
         Connection   connection = DriverManager.getConnection(url,"root","12345678");
            Statement statement=connection.createStatement();
            ResultSet resultSet =    statement.executeQuery("select * from employee_database.employees_tbl");
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
