package org.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.*;
import E2.com.E2G2_qts.Usuario;



@RunWith(MockitoJUnitRunner.class)


public class Mockito {
	private Usuario usuarioMock;
	

	@Before
	public void init() {
		Usuario usuarioMock = Mockito.mock(Usuario.class);
	}
	
	private static Usuario mock(Class<Usuario> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public boolean TestanomeBranco() {
		Usuario us =  Mockitomock(Usuario.class);
		when(us.getNome().contentEquals(" "));
		System.out.println(us.getNome());
		
		
	}
	@Test
	public boolean TestCpf() {
		Usuario us = Mockitomock(Usuario.class);
		when(us.setCpf("1234567894562"));
		System.out.println(us.TamanhoCpf());
	
	}
	
	

	private void when(long cpf) {
		// TODO Auto-generated method stub
		
	}

	private void when(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private Usuario Mockitomock(Class<Usuario> class1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
