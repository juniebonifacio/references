/**
 * 
 */
package com.customer.controller.security;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import com.customer.utility.RestResponse;

/**
 * @author junie.bonifacio
 *
 */
@Controller
@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@POST
	@Path("/credentials")
	@Consumes(MediaType.APPLICATION_JSON)
	public RestResponse login() {
		String message = "Start calling POST /login/credentials.";
		logger.debug(message);
		RestResponse response = new RestResponse();

		
		message = "Done calling POST /login/credentials.";
		logger.debug(message);
		response.setMessage(message);
		return response;
		
	}
	
	@XmlRootElement(name = "credentials")
	class Credentials {
		
		private String username;
		private String password;
		private String clientId;
		private String authToken;
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getClientId() {
			return clientId;
		}
		public void setClientId(String clientId) {
			this.clientId = clientId;
		}
		public String getAuthToken() {
			return authToken;
		}
		public void setAuthToken(String authToken) {
			this.authToken = authToken;
		}
		
	}
}
