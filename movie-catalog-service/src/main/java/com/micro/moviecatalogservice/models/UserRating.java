package com.micro.moviecatalogservice.models;

import java.util.List;



public class UserRating {

	private List<Ratings> userRating;

	public UserRating() {
		
	}
	
	public UserRating(List<Ratings> userRating) {
		this.userRating = userRating;
	}
	
	public List<Ratings> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Ratings> userRating) {
		this.userRating = userRating;
	}
	
}
