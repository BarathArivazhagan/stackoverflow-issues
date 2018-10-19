package com.barath.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

  
   @Autowired
   private PersonCounterService counterService;

  
   @GetMapping("/add")
   public void add() {
	   System.out.println("counte new persons");
       counterService.countNewPersons();
     
   }

 

  
}