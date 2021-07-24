package com.GoRecorder.goRecorderapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "i want to be a Go  recorder";
	}

}
