package com.app;

public class Seller {
	private String sellername;
	private Double rating;
	
	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Seller [sellername=" + sellername + ", rating=" + rating + "]";
	}
}
