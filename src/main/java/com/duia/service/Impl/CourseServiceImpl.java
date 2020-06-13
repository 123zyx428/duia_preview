package com.duia.service.Impl;


import com.duia.entity.Course;
import com.duia.mapping.CourseMapper;
import com.duia.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public Course findCourseById(int id) {
        return courseMapper.selectByPrimaryKey(id);
    }
}
