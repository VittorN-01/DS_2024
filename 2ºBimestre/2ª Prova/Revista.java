import java.util.Scanner;
public class Revista extends Publicacao{
	// Atributos Adicionais
	private int numeroEdicao;
	private String mesPublicacao;
	
	// Construtor
	public Revista() {
	}
	public Revista(int numEd, String mesP) {
		this.numeroEdicao = numEd;
		this.mesPublicacao = mesP;
	}
	
	// Get's & Set's
	// Número da Edição
	public int getNumEdicao() {
		return this.numeroEdicao;
	}
	public void setNumEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	// Mês da Publicação
	public String getMesPublicacao() {
		return this.mesPublicacao;
	}
	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}
	
	@Override
	public void exibirDetalhes() {
		Scanner in = new Scanner(System.in);		
		// "Booleano"
		String res; boolean r;
		System.out.println("Tem Mês de Publicação? (S/N) --> ");
		res = in.next();
		if(res.equalsIgnoreCase("s")) {
			r = true;
		}else {
			r = false;
		}
		
		// Exibindo
		System.out.println("Título: "+this.getTitulo());
		System.out.println("Autor: "+this.getAutor());
		System.out.println("Ano da Publicação: "+this.getAnoPublicacao());
		System.out.println("Nº da Edição: "+this.getNumEdicao());
		if(r == true) {
			System.out.println("Mês de Publicação: "+ this.getMesPublicacao());
		}else {
			System.out.println("Sem mês de publicação");
		}
	}
}