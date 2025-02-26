
public class mensagemBoasVindas {
 
	private String username;
	
	public mensagemBoasVindas (String username) {
		this.username = username;
	}
	
	public String bemVindo() {
		
	String mensagem = "Seja bem vindo à sua calculadora digital, ";
	
	System.out.println(mensagem);
	
	return mensagem;
		
	}
	
	public String bemVindoUsuario() {
	
	String ini =this.bemVindo();
	String mensagem = ini + username + "!/n" + "confira os resultados dos testes no painel da Junit!";
	
	System.out.println(mensagem);
	
	return mensagem;
	
	}
	
}