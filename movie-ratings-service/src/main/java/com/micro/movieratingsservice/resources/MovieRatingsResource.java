package com.micro.movieratingsservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.movieratingsservice.models.Ratings;
import com.micro.movieratingsservice.models.UserRating;



/**
 * @author VADI
 *
 */
@RestController
@RequestMapping("/ratings")
public class MovieRatingsResource {

	@RequestMapping("/{movieId}")
	public Ratings getRatings(@PathVariable("movieId") String movieId) {
		return new Ratings(movieId,4);
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId) {
		List<Ratings> ratings =  Arrays.asList(
				new Ratings("123",4),
				new Ratings("234",5),
				new Ratings("345",3)	
		);
		UserRating userRatings = new UserRating();	
		userRatings.setUserRating(ratings);
		return userRatings;
	}
	
}