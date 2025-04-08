package com.telusko.springdatajpaex;

import com.telusko.springdatajpaex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo  extends JpaRepository <Student,Integer> {

    List<Student> findByName(String name);
    List<Student> findByMarksGreaterThan(int i);



}
