package com.example.movie.model;
import lombok.Data;
import java.util.List;

@Data
public class Movie{
	
	private String title;
	private String postr_path;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPostr_path() {
		return postr_path;
	}
	public void setPostr_path(String postr_path) {
		this.postr_path = postr_path;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public double getVote_average() {
		return vote_average;
	}
	public void setVote_average(double vote_average) {
		this.vote_average = vote_average;
	}
	private String overview;
	private double vote_average;
}