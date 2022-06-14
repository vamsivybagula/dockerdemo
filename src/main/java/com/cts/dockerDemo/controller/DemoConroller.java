package com.cts.dockerDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoConroller {
	
	@GetMapping("/get")
	public String home()
	{
		return "Good evening, lets delpoy this into docker";
	}

}
