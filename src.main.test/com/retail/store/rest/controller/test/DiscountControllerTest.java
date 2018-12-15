package com.retail.store.rest.controller.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.retail.store.rest.domain.DiscountDO;

public class DiscountControllerTest  extends DiscountAbstractTest {
	
	@Override
	   @Before
	   public void setUp() {
	      super.setUp();
	   }
	
	  @Test(expected = Exception.class)
	   public void getDiscountWithOutParam() throws Exception {
	      String uri = "/retail/discount";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(400, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      DiscountDO discount = super.mapFromJson(content, DiscountDO.class);
	      assertTrue(discount.getFinalDiscount() > 0);
	   }
	
	  @Test()
	   public void getDiscountWithParam() throws Exception {
	      String uri = "/retail/discount?item=mobile&discountType=affiliate&price=990";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      DiscountDO discount = super.mapFromJson(content, DiscountDO.class);
	      assertTrue(discount.getFinalDiscount() > 0);
	   }
	
	

}
