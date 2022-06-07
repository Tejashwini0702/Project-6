package com.Springbootrestapiapplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService obj;
	@GetMapping("/home")
	public String home() {
		
		return "Welcome to RESTAPI Spring Home";
	}
	@GetMapping("/student")
	public List<Student> getStudent(){		
		return this.obj.getStudent();
	}
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student ) 
	{
		return  this.obj.addStudent(student);
	}
}