package com.retail.store.rest.service.impl.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.retail.store.rest.service.impl.DiscountServiceImpl;
import com.retail.store.rest.util.DiscountConstant;




/**
 * @author Syed Sheeraz Shaukat
 * 
 * Junit test case for discount service 
 *
 */
@RunWith(value = BlockJUnit4ClassRunner.class)
public class DiscountServiceImplTest extends TestCase {

	DiscountServiceImpl iDiscountServies = new DiscountServiceImpl();

	@Test(expected = NullPointerException.class)
	public void testingGetFinalDiscountWithNullCheck() {

		assertNull("Here is test for Null Check Result: " + null,
				iDiscountServies.getFinalDiscount(null, null, null));

	}

	@Test(expected = AssertionError.class)
	public void testingGetFinalDiscountWithZeroPercentTest() {

		assertEquals("Here is test for Zero percent Discount Check Result: "
				+ DiscountConstant.ZERO_PERCENT,
				iDiscountServies.getFinalDiscount(
						DiscountConstant.GROCERIES_ITEM, 120.00, null));

	}

	@Test(expected = AssertionError.class)
	public void testingGetFinalDiscountWithThirtyPercentTest() {

		assertEquals("Here is test for Thirty percent Discount Check Result: " + 42.0,
				iDiscountServies.getFinalDiscount("", 120.00,
						DiscountConstant.STORE_EMPLOYEE));

	}

	@Test(expected = AssertionError.class)
	public void testingGetFinalDiscountWithTenPercentTest() {

		assertEquals("Here is test for Ten percent Discount Check Result: " + 18.0,
				iDiscountServies.getFinalDiscount("", 120.00,
						DiscountConstant.AFFILIATE_CUSTOMER));

	}

	@Test(expected = AssertionError.class)
	public void testingGetFinalDiscountWithFivePercentTest() {

		assertEquals("Here is test for Five percent Discount Check Result: " + 12.0,
				iDiscountServies.getFinalDiscount("", 120.00,
						DiscountConstant.PREMIUM_CUSTOMER));

	}

}
