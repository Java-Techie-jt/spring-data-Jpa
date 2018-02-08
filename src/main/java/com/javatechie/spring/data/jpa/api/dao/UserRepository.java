package com.javatechie.spring.data.jpa.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javatechie.spring.data.jpa.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByProfession(String profession);

	public long countByAge(int age);

	public List<User> deleteByName(String name);

	// multi condition
	public List<User> findByProfessionAndAge(String profession, int age);

	// ignore case
	public List<User> findByProfessionIgnoreCase(String profession);

	
	@Query("select u from User u")
	public List<User> getUsersCustomQuery();

}
