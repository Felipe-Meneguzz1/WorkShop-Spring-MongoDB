package com.felipe.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.felipe.workshopmongo.domain.Post;
import com.felipe.workshopmongo.domain.User;
import com.felipe.workshopmongo.dto.AuthotDTO;
import com.felipe.workshopmongo.repository.PostRepository;
import com.felipe.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userReposiroty;

	@Autowired
	private PostRepository postReposiroty;

	@Override
	public void run(String... arg0) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userReposiroty.deleteAll();
		postReposiroty.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userReposiroty.saveAll(Arrays.asList(maria, alex, bob));
		
		Post post1 = new Post(null, null, "Partiu viagem", "Vou viajar para São Paulo. Abraços!", new AuthotDTO(maria));
		Post post2 = new Post(null, null, "Partiu viagem", "Vou viajar para São Paulo. Abraços!",  new AuthotDTO(maria));
	
		postReposiroty.saveAll(Arrays.asList(post1, post2));
	}

}