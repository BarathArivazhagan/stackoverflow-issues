package com.barath.app.product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="product-service", url = "http://localhost:9100", fallback= ProductServiceClientFallback.class)
public interface ProductServiceClient {
	
	@GetMapping("/products")
	ResponseEntity<?> hello();
	

}

@Component
class ProductServiceClientFallback implements ProductServiceClient {

	@Override
	public ResponseEntity<?> hello() {
		 System.out.println("hello fallback");
		return ResponseEntity.ok().build();
	}
   
}
