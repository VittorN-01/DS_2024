
//Classe para controlar os gastos da empresa com Bonificação
public class ControleBonificacao {
	//Atributo soma, serve para somar cada uma das bonificações
	private double soma;
	
	
	//Método que recebe como parametro um objeto do tipo Funcionario
	public void registra(Funcionario f ) {
		//executando o getBonificação especifico de cada funfionario e armazenado o valor dentro
		double boni = f.getBonificacao();
		
		//somando a variavel boni dentro da variavel soma
		this.soma = this.soma + boni;
	}
	
	
	//Método getSoma();
	public double getSoma() {
		
		return this.soma;
	}
	
}
