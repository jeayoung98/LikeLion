package com.example.jdbc;

import java.util.List;

public class DeptDAORun {
    public static void main(String[] args) {
        DeptDTO deptDTO = new DeptDTO();
        DeptDAO deptDAO = new DeptDAO();
        deptDTO.setDeptno(1);
        deptDTO.setDname("hi");
        deptDTO.setLoc("서울");
//        deptDAO.addDept(deptDTO);

//        deptDAO.deleteDept(1);
        deptDAO.updateDept(deptDTO,"hello");
        deptDAO.allDept();
        List<DeptDTO> deptDTOList =  deptDAO.allDept();
        for (DeptDTO dto : deptDTOList) {
            System.out.println(dto);
        }
    }

}
