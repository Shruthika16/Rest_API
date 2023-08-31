package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Car;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface CarRepo extends JpaRepository<Car, Integer>{
	
	@Query(value="select * from cartable where owner=:sn",nativeQuery=true)
	public List<Car>getownerinfo(@Param("sn") int owner);

	@Query(value="select * from cartable where carname=:sn",nativeQuery=true)
	public List<Car>getcarnameinfo(@Param("sn") String carname);
	
	@Query(value="select * from cartable where owner=:sn or cartype=:ss",nativeQuery=true)
	public List<Car>getownerandtypeinfo(@Param("sn") int owner,@Param("ss") String cartype);
	
	@Query(value="select * from cartable where address=:ss",nativeQuery=true)
	public List<Car>getaddressinfo(@Param("ss") String address);
	

	

}
