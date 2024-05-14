package org.example.jdbc02.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class DeptDao {
    private final JdbcTemplate jdbcTemplate;
    public List<Dept> getDepts() {
        RowMapper<Dept> deptRowMapper = (ResultSet rs, int rowNum) -> { // DeptRowMapper
            Dept dept = new Dept();
            dept.setId(rs.getInt("deptno"));
            dept.setDeptName(rs.getString("dname"));
            dept.setLocation(rs.getString("loc"));
            return dept;
        };
        return jdbcTemplate.query("select * from dept", deptRowMapper);
    }
}
