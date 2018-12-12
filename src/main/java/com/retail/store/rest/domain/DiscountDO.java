package com.retail.store.rest.domain;

import java.io.Serializable;

/**
 * @author Syed Sheeraz Shaukat
 * 
 * Domain class to calculate the discount 
 *
 */

public class DiscountDO implements Serializable {


	private static final long serialVersionUID = 1L;


	private Double finalDiscount;


	public Double getFinalDiscount() {
		return finalDiscount;
	}


	public void setFinalDiscount(Double finalDiscount) {
		this.finalDiscount = finalDiscount;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((finalDiscount == null) ? 0 : finalDiscount.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiscountDO other = (DiscountDO) obj;
		if (finalDiscount == null) {
			if (other.finalDiscount != null)
				return false;
		} else if (!finalDiscount.equals(other.finalDiscount))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "DiscountDO [finalDiscount=" + finalDiscount + "]";
	}
	
}
