package com.coursera.oo.login;

@SuppressWarnings("serial")
public class LoginException extends Exception{

	private String login;
	
	public LoginException(String message, String login) {
		super(message);
		//passando o login q falhou
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}

}
