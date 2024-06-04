package org.example.springdatajpa4;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "employees")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Employee {
    @Id
    @Column(name = "employee_id", nullable = false)
    private Integer id; // INT (11) UNSIGNED NOT NULL

    @Column(name = "first_name", length = 20)
    private String firstName; // VARCHAR(20)

    @Column(name = "last_name", nullable = false, length = 25)
    private String lastName; // VARCHAR(25) NOT NULL

    @Column(name = "email", nullable = false, length = 25)
    private String email; // VARCHAR(25) NOT NULL

    @Column(name = "phone_number", length = 20)
    private String phoneNumber; // VARCHAR(20)

    @Column(name = "hire_date", nullable = false)
    private Date hireDate; // DATE NOT NULL

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Job job; // VARCHAR(10) NOT NULL

    @Column(name = "salary", nullable = false, precision = 8, scale = 2)
    private Double salary; // DECIMAL(8, 2) NOT NULL

    @Column(name = "commission_pct", precision = 2, scale = 2)
    private Double commissionPct; // DECIMAL(2, 2) NULL

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager; // INT (11) UNSIGNED

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department; // INT (11) UNSIGNED

    @OneToMany(mappedBy = "manager")
    private Set<Employee> subordinates;

    @OneToMany(mappedBy = "employee")
    private Set<JobHistory> jobHistories;
}
