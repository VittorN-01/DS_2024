import java.util.Scanner;
public class Jogo {
	Scanner in = new Scanner(System.in);
	
	private String nome;
	public double preco;
	private String distribuidora;
	
	
	// Get&Set Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		System.out.print("Nome do Jogo: ");
		this.nome = in.next();
	}
	 
	// Get&Set Preço
	public Double getPreco() {
		return preco;
	}
	 public void setPreco(double preco) {
		 System.out.print("Preço do jogo: ");
		 this.preco = in.nextDouble(); 
	 }
	 
	 // Get&Set Distribuidora
	 public String getDistribuidora( ) {
		 return distribuidora; 
	 }
	 public void setDistribuidora(String distribuidora) {
		 System.out.print("Distribuidora do jogo: ");
		 this.distribuidora = in.next();
	 }
	 
	 public void exibirDetalhes() {
			System.out.println("Nome do Jogo: "+this.getNome());
			System.out.println("Preço: "+this.getPreco());
			System.out.println("Distribuidora: "+this.getDistribuidora());
	}
	 
}
