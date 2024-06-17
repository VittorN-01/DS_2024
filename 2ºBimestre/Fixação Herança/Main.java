public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JogoEletronico je1 = new JogoEletronico();
		je1.setNome("Fifa 23");
		je1.setPreco(150.00);
		je1.setDistribuidora("EA");
		je1.setPlataforma("Várias");
		je1.setGenero("Esportes");
		
		je1.exibirDetalhes();
		je1.jogarOnline(11);
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
	}

}
