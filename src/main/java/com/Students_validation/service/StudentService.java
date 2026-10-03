package com.Students_validation.service;

import com.Students_validation.dto.StudentRequestDto;
import com.Students_validation.entity.Student;
import com.Students_validation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent (StudentRequestDto dto){

        Student student = new Student();
        student.setStudentName(dto.getStudentName());
        student.setEmail(dto.getEmail());
        student.setMarks(dto.getMarks());
        student.setMobile(dto.getMobile());


//        Student std =null;
//        try {
//          std  =
//        }catch (Exception e){
//            e.printStackTrace();
//        }
      return  studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
