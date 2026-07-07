package com.project.ProjectS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.ProjectS.model.StudentDTO;
import com.project.ProjectS.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody StudentDTO dto) {

        studentService.save(dto);
        return new ResponseEntity<>("Student saved successfully", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<StudentDTO>> findAll() {

        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> findById(@PathVariable Integer id) {

        return ResponseEntity.ok(studentService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Integer id,
                                         @RequestBody StudentDTO dto) {

        studentService.update(id, dto);
        return ResponseEntity.ok("Student updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {

        studentService.delete(id);
        return ResponseEntity.ok("Student deleted successfully");
    }
}