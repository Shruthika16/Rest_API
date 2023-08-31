package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo br;
	public Book saveinfo(Book b)
	{
		return br.save(b);
	}
	public List<Book> saveinfos(List<Book> b)
	{
		return (List<Book>)br.saveAll(b);
	}
	public List<Book> showinfo()
	{
		return br.findAll();
	}
	public Book changeinfo(Book b)
	{
		return br.saveAndFlush(b);
	}
	public void deleteinfo(Book b)
	{
		br.delete(b);
	}
	public void deleteid(int id)
	{
		br.deleteById(id);
	}
	public void deltepid(int id)
	{
		br.deleteById(id);
	}

}
