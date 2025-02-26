import static org.junit.Assert.*;

import org.junit.Test;

public class mensagemBoasVindasTest {

	@Test
	public void bemVindo() {
		 
		mensagemBoasVindas msn = new mensagemBoasVindas("Eduarda");
		String msnReal = msn.bemVindo();
		String mensagem = "Seja bem vindo à sua calculadora digital, ";
		
		assertEquals(mensagem, msnReal); 
	}

}
