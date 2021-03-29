package com.coursera.oo.login;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TesteAutenticador {

	@Test
	void testeLoginSucesso() throws LoginException {
		Autenticador autentica = new Autenticador();
		Usuario user = autentica.logar("usuario", "senhadousuario");
		String dadosDoLogin = user.getLogin();
		assertEquals("usuario", dadosDoLogin);
	}
	
	@Test//Junit 5 não aceita os parametros de @Test(expected~) tem q ser via Assertions~
	void testeLoginFalho() throws LoginException {
		Autenticador autentica = new Autenticador();
		Assertions.assertThrows(LoginException.class, () -> {
			autentica.logar("usuario", "senhaerradadousuario");
		});
	}
	
	@SuppressWarnings("unused")
	@Test
	public void informacaoDoErro() {
		Autenticador autentica = new Autenticador();
		try {
			Usuario user = autentica.logar("usuario", "senhaerradadousuario");
			fail();
		} catch (LoginException e) {
			assertEquals("usuario", e.getLogin());
		}
	}

}
