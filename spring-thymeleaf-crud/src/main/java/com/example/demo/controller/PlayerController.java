package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Player;
import com.example.demo.service.PlayerService;

@Controller

public class PlayerController {
	@Autowired
	private PlayerService playerService;

	@GetMapping ("/players")
	public String players(Model model) {
		model.addAttribute("players",playerService.findAll());
		return "players/index";
	}

	@GetMapping ("players/new")
	public String newPlayer() {
		return "players/new";
	}

	@GetMapping("players/{id}/edit")
	public String edit(@PathVariable Long id ,Model model) {
		model.addAttribute("player",playerService.findOne(id));
		return "players/edit";
	}

	@GetMapping("players/{id}")
	public String show(@PathVariable Long id ,Model model) {
		model.addAttribute("player",playerService.findOne(id));
		return "players/show";
	}


	@PostMapping("/players")
	public String create( @ModelAttribute Player player ) {

		playerService.save(player);
		return "redirect:/players";
	}

	@PutMapping("players/{id}")
	public String update(
			@PathVariable Long id ,
			@ModelAttribute Player player) {

		 player.setId(id);
		 playerService.update(player);
		 return "redirect:/players";
	}

	@DeleteMapping("players/{id}")
	public String delete(
			@PathVariable Long id ) {
		 playerService.delete(id);
		 return "redirect:/players";
	}


	/*
	 *  Auth section
	 *
	 **/

	@RequestMapping("/auth")
	public String index(){
		return "redirect:/players/messages";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginPost() {
		return "redirect:/login-error";
	}

	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError",true);
		return "login" ;
	}















}



