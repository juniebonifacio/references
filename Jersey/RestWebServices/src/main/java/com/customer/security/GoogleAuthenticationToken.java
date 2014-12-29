package com.customer.security;

import org.apache.shiro.authc.UsernamePasswordToken;

public class GoogleAuthenticationToken extends UsernamePasswordToken  {

	private String googleToken;
	
	public GoogleAuthenticationToken(){}

	public String getGoogleToken() {
		return googleToken;
	}

	public void setGoogleToken(String googleToken) {
		this.googleToken = googleToken;
	}
	
	

}
