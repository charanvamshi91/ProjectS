package com.project.ProjectS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectS.model.StudentDTO;
import com.project.ProjectS.repository.StudentDAO;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public void save(StudentDTO dto) {
        studentDAO.save(dto);
    }

    public List<StudentDTO> findAll() {
        return studentDAO.findAll();
    }

    public StudentDTO findById(Integer id) {
        return studentDAO.findById(id);
    }

    public void update(Integer id, StudentDTO dto) {
        studentDAO.update(id, dto);
    }

    public void delete(Integer id) {
        studentDAO.delete(id);
    }
}