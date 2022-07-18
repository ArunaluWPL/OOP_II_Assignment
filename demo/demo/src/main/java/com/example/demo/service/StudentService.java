//CS/2018/005
// ARUNALU W.P.L.

package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentByCity(String city);
    List<Student> getAllStudents();
    Student insertStudent(Student student);

}
