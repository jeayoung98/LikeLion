package com.example.jdbc;
// 0. 라이브러리 추가

import java.sql.*;
public class ConnectionTest {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost/jeayoung";
        String user = "jeayoung98";
        String password = "wjdwodud98@";

        // 1. 접속해서 얻어오기.
        Connection connection = DriverManager.getConnection(dbUrl,user,password);

        if (connection != null) {
            System.out.println("성공 !!");
        }else System.out.println("실패 ..?");
        String dname = "개발부";
        // statement 를 사용할 때
        String sql1 = "insert into dept(deptno.dname) values(3,'"+dname+"')";
        // DBMS 는 쿼리가 들어오면 번역한다. 이때 같은 쿼리가 들어오면 이미 번역된 것을 이용한다.
        // 값이 바뀌어도 다른 쿼리로 인식한다. 매번 번역.

        // PreparedStatement 를 사용할 때
        String sql2 = "insert into dept(deptno.dname) values(3,?)";
        // 여기까지를 번역.
        // 값이 나중에 바뀌므로 매번 번역하지 않는다. 문자열도 간결, 성능도 좋아짐.
    }
}
