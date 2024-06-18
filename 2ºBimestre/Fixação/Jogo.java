public class Jogo {
	private String nome;
	public double preco;
	private String distribuidora;
	
	
	// Acessor Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	 
	// Acessor Preço
	public Double getPreco() {
		return preco;
	}
	 public void setPreco(double preco) {
		 this.preco = preco; 
	 }
	 
	 // Acessor Distribuidora
	 public String getDistribuidora( ) {
		 return distribuidora; 
	 }
	 public void setDistribuidora(String distribuidora) {
		 this.distribuidora = distribuidora;
	 }
	 
	 public void exibirDetalhes() {
			System.out.println("Nome do Jogo: "+this.getNome());
			System.out.println("Preço: "+this.getPreco());
			System.out.println("Distribuidora: "+this.getDistribuidora());
	}
	 
}
