package com.Students_validation.controller;

import com.Students_validation.dto.StudentRequestDto;
import com.Students_validation.entity.Student;
import com.Students_validation.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student createStudent(@RequestBody @Valid StudentRequestDto dto){
        return studentService.createStudent(dto);

    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
     return studentService.getAllStudents();
    }

}
