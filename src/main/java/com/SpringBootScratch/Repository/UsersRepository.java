package com.SpringBootScratch.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootScratch.Models.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	 Optional<Users> findByUemailAndUpwd(String uemail,String upwd); 
}
 