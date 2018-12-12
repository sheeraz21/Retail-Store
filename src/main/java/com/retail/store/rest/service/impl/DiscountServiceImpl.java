package com.retail.store.rest.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.retail.store.rest.controller.DiscountController;
import com.retail.store.rest.service.IDiscountService;
import com.retail.store.rest.util.DiscountConstant;

/**
 * @author Syed Sheeraz Shaukat
 * 
 * Implementation class of DiscountService Interface
 *
 */


@Service
public class DiscountServiceImpl implements IDiscountService {

	public static final Logger logger = LoggerFactory
			.getLogger(DiscountServiceImpl.class);

	@Override
	public Double getFinalDiscount(String item, Double price,
			String discountType) {
		// TODO Auto-generated method stub
		Double discount = 0.0;
		Double defaultDiscount = getDefaultDiscount(price);

		if (item.equals(DiscountConstant.GROCERIES_ITEM) && !item.isEmpty()
				&& item != null) {

			logger.info("Discount for groceries "
					+ DiscountConstant.ZERO_PERCENT);
			return DiscountConstant.ZERO_PERCENT;

		}

		else {
			if (discountType.equals(DiscountConstant.STORE_EMPLOYEE)
					&& !discountType.isEmpty() && discountType != null) {

				discount = (price * DiscountConstant.THIRTY_PERCENT)
						/ (DiscountConstant.HUNDRED);

				logger.info("Discount for Store Employee " + discount);

				return discount + defaultDiscount;
			}
			if (discountType.equals(DiscountConstant.AFFILIATE_CUSTOMER)
					&& !discountType.isEmpty() && discountType != null) {

				discount = (price * DiscountConstant.TEN_PERCENT)
						/ (DiscountConstant.HUNDRED);

				logger.info("Discount for affiliate customer " + discount);

				return discount + defaultDiscount;
			}
			if (discountType.equals(DiscountConstant.PREMIUM_CUSTOMER)
					&& !discountType.isEmpty() && discountType != null) {

				discount = (price * DiscountConstant.FIVE_PERCENT)
						/ (DiscountConstant.HUNDRED);

				logger.info("Discount for premium customer " + discount);

				return discount + defaultDiscount;

			}

		}

		return discount + defaultDiscount;

	}

	public static Double getDefaultDiscount(Double price) {
		Double discount = 0.0;
		if (null != price && price >= DiscountConstant.HUNDRED) {
			discount = (price * DiscountConstant.FIVE_PERCENT)
					/ (DiscountConstant.HUNDRED);

			logger.info("default discoount " + discount);
		}
		return discount;
	}
}
