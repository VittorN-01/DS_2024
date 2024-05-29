public class Publicacao {
	// Atributos
	private String titulo;
	private String autor;
	private int anoPublicacao;

	// Construtor
	public Publicacao() {
	}
	public Publicacao(String nom, String aut, int anoP) {
		this.titulo = nom;
		this.autor = aut;
		this.anoPublicacao = anoP;
	}

	// Get's & Set's
	// Título
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	// Autor
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	// Ano de Publicação
	public int getAnoPublicacao() {
		return this.anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	// Exibir detalhes
	public void exibirDetalhes() {
		System.out.println("Título: "+this.getTitulo());
		System.out.println("Autor: "+this.getAutor());
		System.out.println("Ano da Publicação: "+this.getAnoPublicacao());
	}
	
}
