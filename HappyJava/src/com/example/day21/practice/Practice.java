package com.example.day21.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        // 실습 문제 1: 숫자 배열 처리
        int[] numbers = {3, 10, 4, 17, 6};
        int evenNum = Arrays.stream(numbers).filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println(evenNum);

        // 실습 문제 2: 문자열 리스트 필터링
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> words1 = words.stream()
                .filter(a -> a.length() >= 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(words1);

        // 실습 문제 3: 학생 성적 처리
        List<Student> students = Arrays.asList(
                new Student("Alice", 82),
                new Student("Bob", 90),
                new Student("Charlie", 72),
                new Student("David", 76)
        );

        List<String> over80Students = students.stream()
                .filter(student -> student.getScore() >= 80)
                .map(Student::getName).sorted()
                .collect(Collectors.toList());
        System.out.println(over80Students);

        // 실습 문제 4: 직원 관리
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "HR", 2000),
                new Employee("Charlie", "Engineering", 5000),
                new Employee("David", "Engineering", 4000)
        );
        Map<String, Double> map = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        map.forEach((a,b) -> System.out.println(a + ": "+b));

        // 실습 문제 5: 제품 카테고리별 평균 가격 계산
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.00),
                new Product("Smartphone", "Electronics", 700.00),
                new Product("Desk", "Furniture", 300.00),
                new Product("Chair", "Furniture", 150.00)
        );
        Map<String, Double> map1 = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));
        map1.forEach((a, b) -> System.out.println(a + " : " + b));

        // 실습 문제 6: 나이대별 평균 점수 계산
        List<Student1> students1 = Arrays.asList(
                new Student1("Alice", 14, 88),
                new Student1("Bob", 23, 82),
                new Student1("Charlie", 17, 95),
                new Student1("David", 21, 73)
        );
        Map<Integer, Double> map2 = students1.stream()
                .collect(Collectors.groupingBy(
                        a -> (a.getAge() / 10) * 10,
                        Collectors.averagingDouble(Student1::getScore)
                ));

        map2.forEach((a, b) -> System.out.println(a + "s : " + b));

        // 실습 문제 7: 도시별 최고 온도 기록
        List<Temperature> temperatures = Arrays.asList(
                new Temperature("Seoul", 33),
                new Temperature("New York", 30),
                new Temperature("Seoul", 34),
                new Temperature("New York", 28)
        );
        Map<String, Integer> map3 = temperatures.stream()
                .collect(Collectors.toMap(
                        Temperature::getCity,
                        Temperature::getMaxTemp,
                        Integer::max
                ));
        map3.forEach((a, b) -> System.out.println(a + " : " + b));
    }
}
