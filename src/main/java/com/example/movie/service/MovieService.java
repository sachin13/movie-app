package com.example.movie.service;
import com.example.movie.model.MovieListResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {
	
	
	@Value("${tmdb.api.key}")
	private String apiKey;
	
	private final RestTemplate restTemplate =new RestTemplate();
	
	public MovieListResponse  getTrendingMovies() {
		String url = "https://api.themoviedb.org/3/trending/movie/week?api_key=" + apiKey;
		
		return restTemplate.getForObject(url, MovieListResponse.class);
	}

}
