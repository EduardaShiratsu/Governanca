import static org.junit.Assert.*;

import org.junit.Test;

	 
	public class calculadoraTest { 

	 

	   @Test 

	   public void testeSomar() { 

	       int nro1 = 5; 

	       int nro2 = 5; 

	       calculadora calc= new calculadora(); 

	       int resultadoEsperado = 10; 

	       int resultadoReal= calc.somar(nro1, nro2); 

	       assertEquals(resultadoEsperado, resultadoReal); 

	   } 

	 

	  @Test 

	  public void testeSubtrair() { 

	      int nro1 = 5; 

	      int nro2 = 3; 

	      calculadora calc = new calculadora(); 

	      int resultadoEsperado= 2; 

	      int resultadoReal= calc.subtrair(nro1, nro2); 

	      assertEquals(resultadoEsperado, resultadoReal);   

	  } 

	   

	   @Test 

	   public void testeMultiplicar() { 

	       int nro1 = 3; 

	       int nro2 = 3; 

	       calculadora calc = new calculadora(); 

	       int resultadoEsperado = 9; 

	       int resultadoReal = calc.multiplicar(nro1, nro2); 

	       assertEquals(resultadoEsperado, resultadoReal); 

	   } 

	  @Test 

	  public void testeDividir() { 

	      int nro1 = 3; 

	      int nro2 = 2; 

	      calculadora calc = new calculadora(); 

	      double resultadoEsperado= 1.5; 

	      double resultadoReal = calc.dividir(nro1, nro2); 

	      assertEquals(resultadoEsperado, resultadoReal, 0.5); 

	  } 

	} 


