package com.example.carami;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaramiController {
	@GetMapping("/carami")
	public String carami() {
		return "carami hello!~!!";
	}
}
