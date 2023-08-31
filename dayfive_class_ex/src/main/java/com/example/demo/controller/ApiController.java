package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
public class ApiController {
	@Autowired
	BookService bser;
	@PostMapping("uploadmany")
	public List<Book> adddetails(@RequestBody List<Book> b)
	{
		return bser.saveinfos(b);
	}
	@PostMapping("upload")
	public Book adddetail(@RequestBody Book b)
	{
		return bser.saveinfo(b);
	}
	@GetMapping("disp")
	public List<Book> show(){
		return bser.showinfo();
	}
	@PutMapping("update")
	public Book alter(@RequestBody Book b)
	{
		return bser.changeinfo(b);
	}
	@DeleteMapping("delete")
	public String delete(@RequestBody Book b)
	{
		bser.deleteinfo(b);
		return "Successfully deleted";
	}	
	@DeleteMapping("deletebypath/{id}")
	public String deleteidbypath(@PathVariable int id)
	{
		bser.deleteid(id);
		return "Successfully deleted";
	}
	@DeleteMapping("deletebyreqparam")
	public void deleteidbyparam(@RequestParam int id)
	{
		bser.deleteid(id);
	}
}

