package com.example.movie.controller;

import org.springframework.ui.Model;
import com.example.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.movie.service.MovieService;

@Controller
public class MovieController {
	

	
	
	@GetMapping("/")
	public String home(Model model) {
	
		 return "redirect:/index.html";
	}

}
 