package com.sahinoglu.purchase_order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PurchaseOrderController {
	@GetMapping("/purchase-orders")
	public String getMethodName(@RequestParam String param) {
		return new String();
	}

	@PostMapping("purchase-orders")
	public String postMethodName(@RequestBody String entity) {
		// TODO: process POST request

		return entity;
	}

	@GetMapping("/purchase-orders/late")
	public String getMethodaName(@RequestParam String param) {
		return new String();
	}

	@GetMapping("purchase-orders/low-stock")
	public String getMethodNamse(@RequestParam String param) {
		return new String();
	}

}
