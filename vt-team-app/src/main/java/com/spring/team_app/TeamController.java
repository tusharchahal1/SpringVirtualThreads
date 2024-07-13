package com.spring.team_app;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class TeamController {

	private RestClient restClient;
	
	public TeamController(RestClient.Builder builder) {
		this.restClient = builder.baseUrl("http://localhost:8081")
				.build();
	}

	@GetMapping("/")
	public List<String> getPlayerForTeam() {
		System.out.println("Runnong on: " + Thread.currentThread());
		return restClient.get()
				.uri("/getPlayers")
				.retrieve()
				.toEntity(List.class).getBody();
	}
}
