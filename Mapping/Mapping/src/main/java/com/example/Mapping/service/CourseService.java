package com.example.Mapping.service;

import com.example.Mapping.Repository.CourseRepository;
import com.example.Mapping.model.Course;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public Course getCourseById(Integer courseId) {
        return courseRepository.findById(courseId).get();
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course updateCourse(Integer courseId, Course course) {
        Course course1=courseRepository.findById(courseId).get();
        course1.setDuration(course.getDuration());
        course1.setTitle(course.getTitle());
        course1.setStudentList(course.getStudentList());
        course1.setDescription(course.getDescription());
        return courseRepository.save(course1);
    }

    public void deleteCourse(Integer courseId) {
        courseRepository.deleteById(courseId);
    }
}

