package com.pisomka.Pisomka.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.pisomka.Pisomka.Entity.Page;
import com.pisomka.Pisomka.Repository.PageRepository;


@Service
public class PageService {
	
	@Autowired
	PageRepository repository;
	
	
    @Cacheable(value = "itemCache",key = "#id")
	public Page findById(int id) {
    	Page page = repository.findById(id).get();
		return page;
	}
    @Cacheable(value = "pages")
	public List<Page> findAll(){
		return repository.findAll();
	}
	@CacheEvict(value = "pages", allEntries = true)
	public Page save(Page page) {
	    repository.save(page);
	    return page;
	}
	
	@CacheEvict(value = "pages", allEntries = true)
	public void delete(int id) {
	    repository.deleteById(id);
	}
}
