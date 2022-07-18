//CS/2018/005
// ARUNALU W.P.L.

package com.example.demo.model;



import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    @NotNull
    private String student_number;

    @NotEmpty
    @Size(min= 2,message = "Name should at least contain two letters")
    private String student_name;

    @NotEmpty
    @Size(min= 2,message = "City should at least contain two letters")
    private String city;

    @Email
    @NotEmpty
    private String email;

    @NotNull
    private String birthdate;

    @NotNull
    @Pattern(regexp ="^[0-9]{10}$", message = "Number should xxxxxxxxxx format")
    private String student_tel;

    public Student() {
    }

    public Student(Long id, String student_number, String student_name, String city, String email, String birthdate, String student_tel) {
        this.id = id;
        this.student_number = student_number;
        this.student_name = student_name;
        this.city = city;
        this.email = email;
        this.birthdate = birthdate;
        this.student_tel = student_tel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getStudent_tel() {
        return student_tel;
    }

    public void setStudent_tel(String student_tel) {
        this.student_tel = student_tel;
    }
}
