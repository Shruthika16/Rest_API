package com.example.demo.repository;



import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;



import com.example.demo.model.Bike;

//import com.example.demo.model.Car;



public interface BikeRepo extends JpaRepository<Bike, Integer>{

	@Query(value="select * from biketable where year=:sn",nativeQuery=true)

	public List<Bike>getStudentInfo(@Param("sn") int year);

	

	@Query(value="select * from biketable where year=:sn or bike_name=:ss",nativeQuery=true)

	public List<Bike>getcaryearname(@Param("sn") int year,@Param("ss") String bikename);

	@Query(value="select * from biketable where bike_name=:ss",nativeQuery=true)

	public List<Bike>getbikename(@Param("ss") String bikename);

}


