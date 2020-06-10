package ApsG2;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import APS_G2.CorreioService;

public class TestMokito {
	

@RunWith(MockitoJUnitRunner.class)

public class TestMokito {
	@Test
	public void TestaCidade() {
	CorreioService cs = Mockitomock(CorreioService.class);
	when(cs.getCep()).thenReturn("portoalegre");
	System.out.println(cs.buscaEndereco("9000000"));
	//Assert.assertEquals(10,cs.getNumero());
	}
	@Test
	public void TestaRua() {
	CorreioService cs = Mockitomock(CorreioService.class);
	when(cs.getCep()).thenReturn("assis brasil");
	System.out.println(cs.buscaEndereco("8000000"));
	//System.out.println(cs.getCep());
	
	
	}

	private CorreioService Mockitomock(Class<CorreioService> class1) {
		
		
		return null;
	}
	
}
