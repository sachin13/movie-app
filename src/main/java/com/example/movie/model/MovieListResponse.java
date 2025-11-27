package com.example.movie.model;

import lombok.Data;
import java.util.List;
@Data
public class MovieListResponse {
	
	private List<Movie> results;

	public List<Movie> getResults() {
		return results;
	}

	public void setResults(List<Movie> results) {
		this.results = results;
	}

}
