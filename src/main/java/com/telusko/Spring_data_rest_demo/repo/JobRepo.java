package com.telusko.Spring_data_rest_demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.Spring_data_rest_demo.model.JobPost;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>{
	
	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile,String postDesc);


}
