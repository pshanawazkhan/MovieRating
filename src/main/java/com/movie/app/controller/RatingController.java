package com.movie.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.app.entity.Customer;
import com.movie.app.entity.Movie;
import com.movie.app.entity.Rating;
import com.movie.app.entity.RatingResponse;
import com.movie.app.entity.rating.MovieInf;
import com.movie.app.repository.CustomerRepository;
import com.movie.app.repository.MovieRepository;
import com.movie.app.repository.RatingRepository;

@RestController
@RequestMapping(path="/api/rest/")
public class RatingController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	RatingRepository ratingRepository;
	
	@Autowired
	MovieRepository movieRepositoy;
	
	/*Attribute to Define Movie Interface lambda expression*/
	MovieInf movieInterface;
	
	
	 @PostMapping("/save")
     private Customer saveCustomerDetails(@RequestBody Customer customer) {
		
	 return customerRepository.save(customer);
	}
	
	@PostMapping("/rate")
	private String performRating(@RequestBody Movie movie) {
		
		
		int CustomerId = movie.getCid();
		String data ="";
		Optional<Customer> customer = customerRepository.findById(CustomerId);
		
		  
		if(customerRepository.existsById(CustomerId)) {
			
			
         movieRepositoy.save(movie);
			
			data="movie Rating has been saved with customer id"+CustomerId;
			
		}

		else {	
        data= "Invalid customer id"; 
		}
		
		
		return data;
	}
	
	@PostMapping("/avarageMovie/rating")
	
	private String getAavgMovieRating() {
		
		String data="";
		
		movieInterface= ()->{
			
			List<Rating> l1 = (List<Rating>) ratingRepository.getAvgMovieRating();
			
			return l1;
		};
		
		
		
	Rating r1= 	 movieInterface.getAvgMovieRating().get(0);
		
	data =r1.getMovieName()+"   "+"average rating  "+r1.getRating();
		
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
