package com.retail.store.rest.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Syed Sheeraz Shaukat
 * 
 *         Discount Service Interface
 *
 */

@Component
@Service
public interface IDiscountService {

	public Double getFinalDiscount(String item, Double price,
			String discountType);

}
