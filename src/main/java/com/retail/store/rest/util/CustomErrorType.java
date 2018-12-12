package com.retail.store.rest.util;

/**
 * @author Syed Sheeraz Shaukat
 * 
 * Custom Exception Class 
 *
 */

public class CustomErrorType {

	private String errorMessage;
	 
    public CustomErrorType(String errorMessage){
        this.errorMessage = errorMessage;
    }
 
    public String getErrorMessage() {
        return errorMessage;
    }
	
}
