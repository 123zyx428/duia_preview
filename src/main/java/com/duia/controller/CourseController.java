package com.duia.controller;

import com.duia.entity.Course;
import com.duia.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {
    @Autowired
    CourseService courseService;

    //根据id找到课程

    @RequestMapping("/findCourse")   //留供前端页面访问的端口
    @ResponseBody                    //以json格式返回数据
    @CrossOrigin                     //跨域访问
    public Course findCourseById(int id){
        return courseService.findCourseById(id);
    }
}
