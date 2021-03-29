package com.coursera.oo.login;

public class Autenticador {
	
	public Usuario logar(String login, String senha) throws LoginException {
		if(login.equals("usuario") && senha.equals("senhadousuario")) {
			return new Usuario(login);
		}
		throw new LoginException("Usuário e senha não conferem!", login);
		
	}

}
