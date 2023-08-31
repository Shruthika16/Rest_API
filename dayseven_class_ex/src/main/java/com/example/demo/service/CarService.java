package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@Service
public class CarService {
	
	@Autowired
	CarRepo cr;
	
	public Car saveinfo(Car c)
	{
		return cr.save(c);
	}
	
	public List<Car> saveinfos(List<Car> c)
	{
		return (List<Car>)cr.saveAll(c);
	}
	
	public List<Car> showinfo()
	{
		return cr.findAll();
	}
	
	public Car updateinfo(Car c)
	{
		return cr.saveAndFlush(c);
	}
	
	public void deleteinfo(Car c)
	{
		cr.delete(c);
	}
	//
	public List<Car>showowner(int owner)
	{
		return cr.getownerinfo(owner);
	}
	
	public List<Car>showcarname(String carname)
	{
		return cr.getcarnameinfo(carname);
	}
	
	public List<Car>showownerandtype(int owner,String cartype)
	{
		return cr.getownerandtypeinfo(owner,cartype);
	}

	public List<Car>showaddress(String address)
	{
		return cr.getaddressinfo(address);
	}
}
