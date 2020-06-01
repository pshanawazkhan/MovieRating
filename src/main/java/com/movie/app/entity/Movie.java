package com.movie.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Movie")
public class Movie {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mid;
	
	@Column(name="Movie_Id")
	private String movieName;
	
	@Column(name="Customer_id")
	private int cid;
	
	    @OneToMany(targetEntity = Rating.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="mid_fk",referencedColumnName = "mid")
	    private List<Rating> rating;

		public int getMid() {
			return mid;
		}

		public void setMid(int mid) {
			this.mid = mid;
		}

		public String getMovieName() {
			return movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public List<Rating> getRating() {
			return rating;
		}

		public void setRating(List<Rating> rating) {
			this.rating = rating;
		}
	    
	    
	    
	    

}
