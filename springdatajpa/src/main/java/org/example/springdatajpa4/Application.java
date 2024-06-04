package org.example.springdatajpa4;



import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository repository) {
        return (args -> {
            log.info("Employees with last name 'Doe':");
            repository.findByLastName("Doe").forEach(employee -> log.info(employee.toString()));
            log.info("Employees with salary greater than or equal to 55000:");
            repository.findBySalaryGreaterThanEqual(55000.0).forEach(employee -> System.out.println((employee.toString())));

            log.info("Employee with employee ID 1:");
            repository.findById(1).ifPresent(employee -> log.info(employee.toString()));

            log.info("Employees with salary less than 5000.0 or greater than 10000.0:");
            repository.findBySalaryLessThanOrSalaryGreaterThan(5000.0, 10000.0).forEach(employee -> log.info(employee.toString()));

            log.info("Employees hired between 2018-01-01 and 2021-01-01:");
            repository.findByHireDateBetween(Date.valueOf("2018-01-01"), Date.valueOf("2021-01-01")).forEach(employee -> log.info(employee.toString()));

            log.info("Employees in departments 1 and 2:");
            repository.findByDepartmentIdIn(Arrays.asList(1, 2)).forEach(employee -> log.info(employee.toString()));

            log.info("Employees in department 1 with salary between 2900 and 3100:");
            repository.findByDepartmentIdInAndSalaryBetween(Arrays.asList(30), 2900.0, 3100.0).forEach(employee -> log.info(employee.toString()));

            log.info("Employees with no manager:");
            repository.findByManagerIdIsNull().forEach(employee -> log.info(employee.toString()));

            log.info("Employees with a manager:");
            repository.findByManagerIdIsNotNull().forEach(employee -> log.info(employee.toString()));

            log.info("Employees with commission percentage not null, ordered by salary desc and commission percentage desc:");
            repository.findByCommissionPctNotNullOrderBySalaryDescCommissionPctDesc().forEach(employee -> log.info(employee.toString()));

            log.info("Employees with last name starting with 'Do':");
            repository.findByLastNameStartingWith("Do").forEach(employee -> log.info(employee.toString()));

        });
    }
}
