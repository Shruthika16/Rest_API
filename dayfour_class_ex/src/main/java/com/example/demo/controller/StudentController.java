package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService sser;
	
	@PostMapping("addstudent")
	public Student add(@RequestBody Student ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("showdetails")
	public List<Student> show(){
		return sser.showinfo();
	}

}
