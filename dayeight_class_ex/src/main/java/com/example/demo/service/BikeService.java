package com.example.demo.service;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.example.demo.model.Bike;

import com.example.demo.repository.BikeRepo;



@Service

public class BikeService {

@Autowired

BikeRepo sr;

public Bike add(Bike ss)

{

	return sr.save(ss);

}

public List<Bike> show()

{

	return sr.findAll();

}

public List<Bike> showyears(int ye)

{

	return sr.getStudentInfo(ye);

	}



public List<Bike> showyearsname(int year, String bikename) {

	return sr.getcaryearname(year,bikename);

}

public List<Bike>showname(String bikename)

{

	return sr.getbikename(bikename);

}

}
