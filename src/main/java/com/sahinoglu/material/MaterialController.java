package com.sahinoglu.material;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaterialController {
	@GetMapping("path")
public String getMethodName(@RequestParam String param) {
    return new String();
}

}
