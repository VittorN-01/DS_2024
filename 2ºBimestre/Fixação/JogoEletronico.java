import java.util.Scanner;
public class JogoEletronico extends Jogo{
	Scanner in = new Scanner(System.in);
	
	private String plataforma;
	private String genero;
	
	
	// Acessor Plateforma
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		System.out.print("Qual � a plataforma: ");
		this.plataforma = in.next();
	}
	
	// Acessor G�nero
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		System.out.print("Qual � o g�nero: ");
		this.genero = in.next();
	}
	
	
	public void jogarOnline(int quantidadeJogadores) {
		System.out.print("Quantidade de jogadores por partida: ");
		quantidadeJogadores = in.nextInt();
		System.out.println("Jogando Online com " + quantidadeJogadores+" jogadores");
	}
	
	@Override
	public void exibirDetalhes() {	
		super.exibirDetalhes();
		System.out.println("Plataforma: "+getPlataforma());
		System.out.println("G�nero: "+getGenero());
	}
	
	
}
