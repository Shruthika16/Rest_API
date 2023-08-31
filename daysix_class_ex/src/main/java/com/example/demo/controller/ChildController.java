package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Child;
import com.example.demo.service.ChildService;

@RestController
public class ChildController {
	
	@Autowired
	ChildService cser;
	@PostMapping("add")
	public Child adddetail(@RequestBody Child c) {
		return cser.saveinfo(c);
	}
	@PostMapping("adddetails")
	public List<Child> adddetails(@RequestBody List<Child> c)
	{
		return cser.saveinfos(c);
	}
	@GetMapping("show")
	public List<Child> showdetails(){
		return cser.showinfo();
	}
	@PutMapping("update")
	public Child modify(@RequestBody Child c)
	{
		return cser.updateinfo(c);
	}
	@DeleteMapping("delete")
	public String deletedetail(@RequestBody Child c)
	{
		cser.deleteinfo(c);
		return "Deleted Sucessfully";
	}
	@GetMapping("sort/{name}")
	public List<Child> getsortinfo(@PathVariable String name)
	{
		return cser.sortinfo(name);
	}
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<Child> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return cser.getbypage(pageno,pagesize);
	}
	@GetMapping("pagingn/{pageno}/{pagesize}  /{s}")
	public List<Child> showpageinfon(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String s)
	{
		return cser.sortpaging(pageno,pagesize,s);
	}
}
