package com.example.demo.controller;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;



import com.example.demo.model.Bike;

import com.example.demo.service.BikeService;



@RestController

public class BikeController {

@Autowired

BikeService sser;

@PostMapping("add")

public Bike adddet(@RequestBody Bike ss)

{

	return sser.add(ss);

}

@GetMapping("show")

public List<Bike> showdet()

{

	return sser.show();

}

@GetMapping("year/{yearin}")

public List<Bike> showyear(@PathVariable int yearin)

{

	return sser.showyears(yearin);

}

@GetMapping("yearn/{year}/bikename/{bikename}")

public List<Bike> showyearname(@PathVariable int year,@PathVariable String bikename)

{

	return sser.showyearsname(year,bikename);

}

@GetMapping("bikename/{bikename}")

public List<Bike> showbike(@PathVariable String bikename)

{

	return sser.showname(bikename);

}

}