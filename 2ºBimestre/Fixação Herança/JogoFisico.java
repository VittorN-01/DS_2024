public class JogoFisico extends Jogo{
	private int quantidadeJogadores;
	private double tempoPartida;
	
	// Acessor Qnt. Jogadores
	public int getQuantidadeJogadores() {
		return quantidadeJogadores;
	}
	public void setQuantidadeJogadores(int quantidadeJogadores) {
		this.quantidadeJogadores = quantidadeJogadores;
	}
	
	// Acessor Tempo de Partida
	public Double getTempoPartida() {
		return tempoPartida;
	}
	public void setTempoPartida(double tempoPartida) {
		this.tempoPartida = tempoPartida;
	}
	
	public void calcularTempoTotal (int qntPartidas, double tempoPartida){
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
