package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.Category;
@Repository
public interface Categoryepo extends JpaRepository<Category, Long>  {

}
