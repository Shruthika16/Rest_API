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



import com.example.demo.model.Car;

import com.example.demo.service.CarService;



@RestController

public class CarController {

   @Autowired

   CarService cser;

   

   @PostMapping("add")

   public Car add(@RequestBody Car c) {

	   return cser.saveinfo(c);

   }

   @PostMapping("addn")

   public List<Car> addn(@RequestBody List<Car> c){

	   return cser.saveinfos(c);

   }

   @GetMapping("show")

   public List<Car> show(){

	   return cser.showinfo();

   }

   @PutMapping("update")

   public Car modify(Car c) {

	   return cser.updateinfo(c);

   }

   @DeleteMapping("delete")

   public String deletee(Car c) {

	   cser.deleteinfo(c);

	   return "deleted successfully";

   }

   

   @GetMapping("owner/{owner}")

   public List<Car> showownerinfo(@PathVariable int owner){

	   return cser.showowner(owner);

   }

   

   @GetMapping("carname/{carname}")

   public List<Car> showcarnameinfo(@PathVariable String carname){

	   return cser.showcarname(carname);

   }

   @GetMapping("address/{address}")

   public List<Car> showaddressinfo(@PathVariable String address){

	   return cser.showaddress(address);

   }

   @GetMapping("owner/{owner}/cartype/{cartype}")

   public List<Car> showownerandtypeinfo(@PathVariable int owner ,@PathVariable String cartype){

	   return cser.showownerandtype(owner,cartype);

   }

   

}