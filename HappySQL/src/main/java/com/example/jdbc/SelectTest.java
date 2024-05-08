package com.example.jdbc;

import java.sql.*;

public class SelectTest {
    public static void main(String[] args) {
        // 1. 선언
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;


        String dbUrl = "jdbc:mysql://localhost/jeayoung";
        String user = "jeayoung98";
        String password = "wjdwodud98@";
        try {
            // 3. 접속
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbUrl, user, password);

            // 4. 쿼리작성
            preparedStatement = connection.prepareStatement("select deptno,dname,loc from dept");

            // 5. 쿼리실행
            resultSet = preparedStatement.executeQuery();

            // 6. 결과 얻어냄
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("deptno"));
                System.out.println(resultSet.getString(2)+ "   ");
                System.out.println(resultSet.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
