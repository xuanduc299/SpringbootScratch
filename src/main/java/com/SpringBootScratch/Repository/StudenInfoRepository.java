package com.SpringBootScratch.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.SpringBootScratch.Models.StudentInformation;

public interface StudenInfoRepository extends JpaRepository<StudentInformation, Long> {

}
