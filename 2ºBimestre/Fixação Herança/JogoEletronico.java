public class JogoEletronico extends Jogo{
	private String plataforma;
	private String genero;
	
	// Acessor Plateforma
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	// Acessor Gênero
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	public void jogarOnline(int quantidadeJogadores) {
		System.out.println("Jogando Online com " + quantidadeJogadores+" jogadores");
	}
	
	@Override
	public void exibirDetalhes() {	
		super.exibirDetalhes();
		System.out.println("Plataforma: "+getPlataforma());
		System.out.println("Gênero: "+getGenero());
	}
	
	
}
