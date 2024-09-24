public class Conteudo {
	private String categoria;
	private String titulo;
	
	public Conteudo() {
		
	}
	public Conteudo (String c, String t) {
		this.categoria = c;
		this.titulo = t;
	}
	public String getCategoria(){
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void descricao() {
		System.out.println("Categoria: "+this.getCategoria());
		System.out.println("Título: "+this.getTitulo());;
	}
}