package com.pisomka.Pisomka.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pisomka.Pisomka.Entity.Page;

@Repository
public interface PageRepository extends JpaRepository<Page, Integer>{
	@Modifying
	@Query("update Page p set p.story = :story WHERE p.id = :pageId")
	void setPageStory(@Param("pageId") int id, @Param("story") String story);


 }