
//Classe para controlar os gastos da empresa com Bonifica��o
public class ControleBonificacao {
	//Atributo soma, serve para somar cada uma das bonifica��es
	private double soma;
	
	
	//M�todo que recebe como parametro um objeto do tipo Funcionario
	public void registra(Funcionario f ) {
		//executando o getBonifica��o especifico de cada funfionario e armazenado o valor dentro
		double boni = f.getBonificacao();
		
		//somando a variavel boni dentro da variavel soma
		this.soma = this.soma + boni;
	}
	
	
	//M�todo getSoma();
	public double getSoma() {
		
		return this.soma;
	}
	
}
