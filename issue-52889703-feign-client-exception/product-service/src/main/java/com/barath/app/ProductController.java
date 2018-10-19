package com.barath.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/products")
public class ProductController {
	
	@GetMapping
	public String hello() throws Exception {

        if (true) {
            throw new Exception("Service B Exception...");
        }
        return "Hello World";
	}

}
