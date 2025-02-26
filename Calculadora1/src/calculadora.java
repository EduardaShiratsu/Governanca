public class calculadora {
	

    private int resultado = 0; 
    private double resultadoDiv = 0; 


    public int somar( int n1, int n2 ){ 

        resultado = n1 + n2; 
        return resultado; 

    } 


    public int subtrair( int n1, int n2 ){ 

        resultado = n1 - n2; 
        return resultado; 

    }         


    public int multiplicar( int n1, int n2 ){ 

        resultado = n1 * n2; 
        return resultado; 

    } 



    // método dividir 

    public double dividir( int n1, int n2 ){ 

        resultadoDiv = n1 / n2; 
        return resultadoDiv; 

    } 

} 


