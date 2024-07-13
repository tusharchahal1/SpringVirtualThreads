package com.spring.player_block;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	@GetMapping("/getPlayers")
	public List<String> getPlayers() throws InterruptedException {
		Thread.sleep(2000);
		return List.of("Sachin","MS Dhoni", "Virat");
	}
}
