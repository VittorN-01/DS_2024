public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Jogos Eletrônicos
		JogoEletronico je1 = new JogoEletronico();
		je1.setNome("Fifa 23");
		je1.setPreco(150.00);
		je1.setDistribuidora("EA");
		je1.setPlataforma("Várias");
		je1.setGenero("Esportes");
		
		je1.exibirDetalhes();
		je1.jogarOnline(11);
		System.out.println();
		
		JogoEletronico je2 = new JogoEletronico();
		je2.setNome("Call of Duty");
		je2.setPreco(200);
		je2.setDistribuidora("Activision Square Enix");
		je2.setPlataforma("Várias");
		je2.setGenero("Ação");
		
		je2.exibirDetalhes();
		je2.jogarOnline(12);
		System.out.println();
		
		// Jogos Físicos
		JogoFisico jf1 = new JogoFisico();
		jf1.setNome("Grand Theft Auto: San Andreas ");
		jf1.setPreco(89.90);
		jf1.setDistribuidora("Rockstargames");
		jf1.setQuantidadeJogadores(2);
		jf1.setTempoPartida(70);
				
		jf1.exibirDetalhes();
		jf1.calcularTempoTotal(15, 70);
		System.out.println();
		
		
		JogoFisico jf2 = new JogoFisico();
		jf2.setNome("Lego Batman");
		jf2.setPreco(79.99);
		jf2.setDistribuidora("WBGames");
		jf2.setQuantidadeJogadores(2);
		jf2.setTempoPartida(22);
				
		jf2.exibirDetalhes();
		jf2.calcularTempoTotal(30, 22);
	}

}
