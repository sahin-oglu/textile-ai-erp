package com.sahinoglu.supplier;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SupplierController {

	
	
	@GetMapping("/suppliers")
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	
}
