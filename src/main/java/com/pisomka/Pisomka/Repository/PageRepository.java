package com.pisomka.Pisomka.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pisomka.Pisomka.Entity.Page;

@Repository
public interface PageRepository extends JpaRepository<Page, Integer>{

 }