package com.movie.app.entity.rating;

import java.util.List;

import com.movie.app.entity.Rating;

@FunctionalInterface
public interface MovieInf {

	
	
	//List<Rating> l1 = (List<Rating>) ratingRepository.getAvgMovieRating();
	
	List<Rating> getAvgMovieRating();
	
	
	
}
