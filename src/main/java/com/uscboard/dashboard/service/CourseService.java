package com.uscboard.dashboard.service;

import java.util.List;

import com.uscboard.dashboard.model.Course;
import com.uscboard.dashboard.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repo;
    public void create(Course course){
        repo.save(course);
    }
    public List<Course> findAvalaibleCourses(){
        return repo.findAll();
    }

}
