package com.example.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {

    private String dbUrl = "jdbc:mysql://localhost/jeayoung";
    private String user = "jeayoung98";
    private String password = "wjdwodud98@";

    // 입력
    public boolean addDept(DeptDTO deptDTO) {
        String sql = "insert into dept(deptno, dname,loc) values (?,?,?)";
        boolean add = true;
        try (Connection connection = DriverManager.getConnection(dbUrl, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1,deptDTO.getDeptno());
            preparedStatement.setString(2,deptDTO.getDname());
            preparedStatement.setString(3, deptDTO.getLoc());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // 수정
    public int updateDept(DeptDTO deptDTO,String newName) {
        String sql = "update dept set dname = ? where deptno = ?";
        try(Connection connection = DriverManager.getConnection(dbUrl, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, deptDTO.getDeptno());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;

    }
    // 삭제
    public void deleteDept(int deptno) {
        String sql = "delete from dept where deptno = ?";
        try (Connection connection = DriverManager.getConnection(dbUrl, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1,deptno);
            preparedStatement.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("삭제 완");
    }

    // 한건 조회
    public DeptDTO pickDept(int deptno) {
        DeptDTO deptDTO = null;
        ResultSet result = null;
        String sql = "select deptno,dname,loc from dept where deptno = ?";
        try (Connection connection = DriverManager.getConnection(dbUrl, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ) {
            preparedStatement.setInt(1, deptno);
            result = preparedStatement.executeQuery();
            if (result.next()) {
                System.out.println(result.getInt("deptno"));
                System.out.println(result.getString(2)+ "   ");
                System.out.println(result.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deptDTO;

    }



    // 모두 조회
    public List<DeptDTO> allDept() {
        List<DeptDTO> deptList = new ArrayList<>();
        ResultSet result = null;
        String sql = "select deptno,dname,loc from dept";
        try (Connection connection = DriverManager.getConnection(dbUrl, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
//            preparedStatement.setInt(1, deptno);
            result = preparedStatement.executeQuery();
            while (result.next()) {
                DeptDTO deptDTO = new DeptDTO();
                deptDTO.setDeptno(result.getInt("deptno"));
                deptDTO.setDname(result.getString(2)+ "   ");
                deptDTO.setLoc(result.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deptList;


    }



    // 조건에 맞는 조회

}
