package com.example.day15.practice.employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeManager {
    private Set<Employee> employees;

    public  EmployeeManager(){
        employees = new HashSet<>();
    }

    public void addEmployee(Employee employee){
        if (employees.contains(employee)) {
            System.out.println("이미 등록된 사원입니다.");
        } else {
            employees.add(employee);
            System.out.println("사원 추가 || 이름 : " + employee.getName() + "Id : "+ employee.getId() + "부서 : " + employee.getDepartment());
        }
    }
    public void removeEmployee(Employee employee){
        if (employees.contains(employee)) {
            employees.remove(employee);
            System.out.println("사원 삭제 || 이름 : " + employee.getName() + "Id : "+ employee.getId() + "부서 : " + employee.getDepartment());
        }else System.out.println("해당 사원이 없습니다.");
    }
    public void findEmployee(String id){
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                System.out.println("사원 정보 || 이름 : " + employee.getName() + "Id : "+ employee.getId() + "부서 : " + employee.getDepartment());
            }else System.out.println("해당 사원이 없습니다.");
        }
    }
}
