package com.project.ProjectS.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.ProjectS.model.StudentDTO;

@Repository
public class StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(StudentDTO dto) {

        String sql = "INSERT INTO student "
                + "(student_name, class, college, branch, section, student_code, email, phone_number, password, guardian_name, guardian_phone_number, role_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        return jdbcTemplate.update(sql,
                dto.getStudentName(),
                dto.getClassName(),
                dto.getCollege(),
                dto.getBranch(),
                dto.getSection(),
                dto.getStudentCode(),
                dto.getEmail(),
                dto.getPhoneNumber(),
                dto.getPassword(),
                dto.getGuardianName(),
                dto.getGuardianPhoneNumber(),
                dto.getRoleId());
    }

    public List<StudentDTO> findAll() {

        String sql = "SELECT * FROM student ORDER BY student_id";

        return jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(StudentDTO.class));
    }

    public StudentDTO findById(Integer id) {

        String sql = "SELECT * FROM student WHERE student_id=?";

        return jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(StudentDTO.class),
                id);
    }

    public int update(Integer id, StudentDTO dto) {

        String sql = "UPDATE student SET "
                + "student_name=?, "
                + "class=?, "
                + "college=?, "
                + "branch=?, "
                + "section=?, "
                + "student_code=?, "
                + "email=?, "
                + "phone_number=?, "
                + "password=?, "
                + "guardian_name=?, "
                + "guardian_phone_number=?, "
                + "role_id=? "
                + "WHERE student_id=?";

        return jdbcTemplate.update(sql,
                dto.getStudentName(),
                dto.getClassName(),
                dto.getCollege(),
                dto.getBranch(),
                dto.getSection(),
                dto.getStudentCode(),
                dto.getEmail(),
                dto.getPhoneNumber(),
                dto.getPassword(),
                dto.getGuardianName(),
                dto.getGuardianPhoneNumber(),
                dto.getRoleId(),
                id);
    }

    public int delete(Integer id) {

        String sql = "DELETE FROM student WHERE student_id=?";

        return jdbcTemplate.update(sql, id);
    }
}