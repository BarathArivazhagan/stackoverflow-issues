package com.barath.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barath.app.product.client.ProductServiceClient;

@RestController
@RequestMapping("/inventories")
public class InventoryController {
	
	  private final ProductServiceClient productService;  
	  

	  public InventoryController(ProductServiceClient productService) {
		super();
		this.productService = productService;
	}



	  @GetMapping
	  public ResponseEntity<?> companyInfo() {
	      
		  return productService.hello();

	
	   }

}
