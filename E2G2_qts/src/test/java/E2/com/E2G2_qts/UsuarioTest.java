package E2.com.E2G2_qts;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class UsuarioTest 
{
    /**
     * Rigorous Test :-)
     */
    @SuppressWarnings("deprecation")
	@Test
    public void TestaNomeValido(){
    	Usuario us = new Usuario();
    	String entrada = " assddfghhjj";
    	boolean saidaExp= false;
    	Assert.assertEquals( false,us.TamanhoNome(entrada)); 
       
    }
    @SuppressWarnings("deprecation")
	@Test
    public void TestaNumeroTelefone() {
    	Usuario us = new Usuario();
    	long entrada = 123456789;
    	boolean saidaExp= true;
    	Assert.assertEquals(true ,us.TestaNumFone(entrada));
    }
    @Test
    public void testaNomeEmBranco() {
    	Usuario us = new Usuario();
    	String entrada = " ";
    	boolean saidaExp= false;
    	Assert.assertEquals( false,us.TamanhoNome(entrada)); 
       
    	
    }
}
