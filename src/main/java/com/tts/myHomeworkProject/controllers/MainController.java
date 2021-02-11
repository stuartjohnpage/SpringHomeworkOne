package com.tts.myHomeworkProject.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {

	@RequestMapping("/")
	public String home() {
		return "Welcome, glorious Red Army 'volunteers'! Are you ready to fight for Mother Russia?";
	}
}