package com.telusko.springdatajpaex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.telusko.springdatajpaex.model.Student;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringDataJpaExApplication.class, args);

	StudentRepo repo=context.getBean(StudentRepo.class);
	 Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		s1.setRollNo(101);
		s1.setName("Soham");
		s1.setMarks(75);

		s2.setRollNo(102);
		s2.setName("Naveen");
		s2.setMarks(80);

		s3.setRollNo(103);
		s3.setName("Telusko");
		s3.setMarks(100);

		repo.save(s1);


	}

}
