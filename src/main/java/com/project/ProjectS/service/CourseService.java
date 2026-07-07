package com.project.ProjectS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectS.model.CourseDTO;
import com.project.ProjectS.repository.CourseDAO;

@Service
public class CourseService {

    @Autowired
    private CourseDAO courseDAO;

    public CourseDTO saveCourse(CourseDTO course) {
        return courseDAO.save(course);
    }

    public Iterable<CourseDTO> getAllCourses() {
        return courseDAO.findAll();
    }

    public CourseDTO getCourseById(Long id) {
        return courseDAO.findById(id).orElse(null);
    }

    public CourseDTO updateCourse(CourseDTO course) {
        return courseDAO.save(course);
    }

    public void deleteCourse(Long id) {
        courseDAO.deleteById(id);
    }
}