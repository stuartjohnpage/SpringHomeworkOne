package com.myHomeworkProject.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {

	@RequestMapping("/")
	public String home() {
		return "My very own project! Welcome, glorious Red Army 'volunteers'! Are you ready to fight for Mother Russia?";
	}
}