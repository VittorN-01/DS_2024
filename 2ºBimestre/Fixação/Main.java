public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Jogos Eletrônicos
		System.out.println("Jogo Eletrônico");
		JogoEletronico je1 = new JogoEletronico();
		je1.setNome(null);
		je1.setPreco(0);
		je1.setDistribuidora(null);
		je1.setPlataforma(null);
		je1.setGenero(null);
		
		je1.exibirDetalhes();
		je1.jogarOnline(0);
		System.out.println();
		
		System.out.println("Jogo Eletrônico");
		JogoEletronico je2 = new JogoEletronico();
		je2.setNome(null);
		je2.setPreco(0);
		je2.setDistribuidora(null);
		je2.setPlataforma(null);
		je2.setGenero(null);
		
		je2.exibirDetalhes();
		je2.jogarOnline(0);
		System.out.println();
		
		// Jogos Físicos
		System.out.println("Jogo Físico");
		JogoFisico jf1 = new JogoFisico();
		jf1.setNome(null);
		jf1.setPreco(0);
		jf1.setDistribuidora(null);
		jf1.setQuantidadeJogadores(0);
		jf1.setTempoPartida(0);
				
		jf1.exibirDetalhes();
		jf1.calcularTempoTotal();
		System.out.println();
		
		System.out.println("Jogo Físico");
		JogoFisico jf2 = new JogoFisico();
		jf2.setNome(null);
		jf2.setPreco(0);
		jf2.setDistribuidora(null);
		jf2.setQuantidadeJogadores(0);
		jf2.setTempoPartida(0);
				
		jf2.exibirDetalhes();
		jf2.calcularTempoTotal();
	}

}
