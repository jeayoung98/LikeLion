package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {
    public static void main(String[] args) {
        // 1. 필요한 객체를 선언한다.
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // 3. 접속

            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost/jeayoung";
            String user = "jeayoung98";
            String password = "wjdwodud98@";
            String dname = "인사부";
            int deptno = 50;
            connection = DriverManager.getConnection(dbUrl, user, password);

            // 4. 쿼리작성
            String sql = "update dept set dname = ? where deptno = ?";
//            String sql = "update dept set loc = '말레이시아' where deptno = 50";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "인사부");
            preparedStatement.setInt(2,60);
            // 5. 실행
            int count = preparedStatement.executeUpdate();
            System.out.println(count + "건 수정 완료");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 2. 닫음
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
