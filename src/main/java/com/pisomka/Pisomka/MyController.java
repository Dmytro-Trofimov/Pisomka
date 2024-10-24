package com.pisomka.Pisomka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pisomka.Pisomka.Entity.Page;
import com.pisomka.Pisomka.Services.PageService;

@Controller
public class MyController {

    @Autowired
    private PageService service;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("page", new Page());
        return "home";
    }

    @PostMapping("/publish")
    public String submitForm(Page page) {
        Page savedPage = service.save(page);
        service.delete(savedPage.getId()-1);
        return "redirect:/result/" + savedPage.getId();
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
        return "home";
    }
}
 
