import java.util.Scanner;
public class JogoFisico extends Jogo{
	Scanner in = new Scanner(System.in);
	
	private int quantidadeJogadores;
	private double tempoPartida;
	
	// Acessor Qnt. Jogadores
	public int getQuantidadeJogadores() {
		return quantidadeJogadores;
	}
	public void setQuantidadeJogadores(int quantidadeJogadores) {
		System.out.print("O jogo suporta quantos players: ");
		this.quantidadeJogadores = in.nextInt();
	}
	
	// Acessor Tempo de Partida
	public Double getTempoPartida() {
		return tempoPartida;
	}
	public void setTempoPartida(double tempoPartida) {
		System.out.print("Tempo de partida: ");
		this.tempoPartida = in.nextDouble();
	}
	
	public void calcularTempoTotal(){
		System.out.print("Jogou quantas partidas? ");
		int qntPartidas = in.nextInt();
		double tempoTotal = tempoPartida*qntPartidas;
		System.out.println("Tempo total de jogo: "+tempoTotal+" horas");
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Quantidade de jogadores: "+getQuantidadeJogadores());
		System.out.println("Tempo de Partida: "+getTempoPartida()+" horas");
	}
}
