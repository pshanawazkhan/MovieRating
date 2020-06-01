package com.movie.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.movie.app.entity.Rating;
import com.movie.app.entity.RatingResponse;
@Repository
public interface RatingRepository  extends JpaRepository<Rating, Integer>{
	
	
	//@Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
	
	//@Query(value="select r1.rid,r1.customer_id,r1.mid_fk,r1.rating, r1.movie_name,avg(r1.rating) from rating r1 group by movie_name",nativeQuery=true)
	
	
	@Query(value="select r1.rid,r1.customer_id,r1.mid_fk, r1.movie_name,avg(r1.rating) as rating from rating r1 group by movie_name",nativeQuery=true)
	
	
	public List<Rating> getAvgMovieRating();
	
	
	

}
