import java.util.Scanner;
public class Livro extends Publicacao{
	// Atributos Adicionais
	private int numeroPaginas;
	private String editora;
	
	// Construtor
	public Livro() {
	}
	public Livro(int numP, String ed) {
		this.numeroPaginas = numP;
		this.editora = ed;
	}
	
	// Get's & Set's
	// Número de Páginas
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	// Editora
	public String getEditora() {
		return this.editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	@Override
	public void exibirDetalhes() {
		Scanner in = new Scanner(System.in);
		// "Booleano"
		String res; boolean r;
		System.out.print("Tem editora? (S/N) --> ");
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
		System.out.println("Nº de Páginas: "+this.getNumeroPaginas());
		if(r == true) {
			System.out.println("Editora: "+this.getEditora());
		}else {
			System.out.println("Sem Editora");
		}	
	}
}