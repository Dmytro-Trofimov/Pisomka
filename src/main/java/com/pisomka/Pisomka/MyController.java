package com.pisomka.Pisomka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pisomka.Pisomka.Entity.Page;
import com.pisomka.Pisomka.Entity.PageDTO;
import com.pisomka.Pisomka.Services.PageService;

@Controller
public class MyController {

    @Autowired
    private PageService service;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("page", new PageDTO());
        return "home";
    }

    @PostMapping("/publish")
    public String submitForm(PageDTO pagedto) {
    	if(pagedto.getId()==0) {
    		Page savedPage = service.save(new Page(pagedto.getTitle(),pagedto.getAuthor(), pagedto.getStory()));
    		return "redirect:/result/" + savedPage.getId();
    	}
    	
    	Page page = service.findById(pagedto.getId());
    	page.setAuthor(pagedto.getAuthor());
    	page.setAuthor(pagedto.getTitle());
    	page.setAuthor(pagedto.getStory());
    	return "redirect:/result/" + page.getId();
    }

    @GetMapping("/result/{id}")
    public String resultPage(@PathVariable int id, Model model) {
    	Page page = service.findById(id);
        model.addAttribute("page", page);
        return "result";
    }
    @RequestMapping("/edit/{id}")
    public String editPage(@PathVariable int id,Model model) {
        model.addAttribute("page", service.findById(id));
        return "edit";
    }
}
 