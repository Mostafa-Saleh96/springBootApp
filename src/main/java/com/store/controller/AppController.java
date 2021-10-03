/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.controller;

import com.store.entity.Admin;
import com.store.entity.Data;
import com.store.repository.AdminRepo;
import com.store.repository.DataRepo;
import com.store.dataServ.DataService;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author HAWASEB
 */
@Controller
public class AppController {
    @Autowired
   private AdminRepo adminRepo ;
    @Autowired
    private DataRepo dataRepo;
    @Autowired
    private DataService dataService;
    @PostMapping("/adminLogin")
    public String adminPage(){
        return "/adminLogin"; 
    }
    @GetMapping("/adminLogin")
    public String openAdminLogin(){
        return "/adminLogin"; 
    }
    @GetMapping("/")
    public String openHomePage(Model model){
         Data data= new Data();
        int id = 1;
      data= dataRepo.findById(id).get();
      model.addAttribute("pr", data);
        return "/homePage";
    }
    @GetMapping("/homePage")
    public String openPage(Model model){
         Data data= new Data();
        int id = 1;
      data= dataRepo.findById(id).get();
      model.addAttribute("pr", data);
        return "/homePage";
    }
   
    @PostMapping("/update")
    public String update(@RequestParam("file")MultipartFile file,@RequestParam("title")String title
            ,@RequestParam("description")String description){
      
       dataService.saveData(file, title, description);
      return "redirect:/homePage"; 
    }

    @PostMapping("/adminPage")
    public String adminLog(@RequestParam("userName") String UserName,@RequestParam("password") int password, Model model){
       Admin admin= new Admin();
         admin= adminRepo.findById(password).get();
         if(admin==null|| admin.equals("")){
              return "redirect:/adminLogin";
         }
         
         return "/adminPage";
    }
    
    
    }
