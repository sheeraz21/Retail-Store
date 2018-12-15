package com.retail.store.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retail.store.rest.domain.DiscountDO;
import com.retail.store.rest.service.IDiscountService;
import com.retail.store.rest.util.CustomErrorType;

/**
 * @author Syed Sheeraz Shaukat
 * 
 *         DiscountController Controller Class
 *
 */
@RestController
@RequestMapping("/retail")
public class DiscountController {

	@Autowired
	IDiscountService iDiscountServies;

	public static final Logger logger = LoggerFactory
			.getLogger(DiscountController.class);

	@RequestMapping(value = "/discount", method = RequestMethod.GET)
	public ResponseEntity<?> getDiscount(@RequestParam String item,
			@RequestParam String discountType, @RequestParam Double price) {

		logger.info("Fetching discount details {}" + item);

		Double finalDiscount;
		DiscountDO discountDO = new DiscountDO();

		finalDiscount = iDiscountServies.getFinalDiscount(item, price,
				discountType);
		discountDO.setFinalDiscount(finalDiscount);
		if (finalDiscount == null) {

			return new ResponseEntity(new CustomErrorType(
					"Unable to find discount " + " not found."),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(discountDO, HttpStatus.OK);
	}

}
