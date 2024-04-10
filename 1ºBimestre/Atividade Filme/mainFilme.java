public class mainFilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Os filmes em cartaz são");
		System.out.println();
		
		//Filme 1
		
		testeFilme filme1 = new testeFilme();
		filme1.nome = "Os Vingadores";
		filme1.duracaoMinutos = 142;
		
		System.out.println(filme1.nome);
		System.out.println(filme1.duracaoMinutos +" minutos");
		System.out.println(filme1.exibirDuracaoHoras(filme1.duracaoMinutos));
		System.out.println();
		
		//Filme 2
		
		testeFilme filme2 = new testeFilme();
		filme2.nome = "Hotel Transilvânia";
		filme2.duracaoMinutos = 93;
		
		System.out.println(filme2.nome);
		System.out.println(filme2.duracaoMinutos+ " minutos");
		System.out.println(filme2.exibirDuracaoHoras(filme2.duracaoMinutos));
		System.out.println();
		
		//Filme 3
		
		testeFilme filme3 = new testeFilme();
		filme3.nome = "Gente Grande 2";
		filme3.duracaoMinutos = 101;
		
		System.out.println(filme3.nome);
		System.out.println(filme3.duracaoMinutos+ " minutos");
		System.out.println(filme3.exibirDuracaoHoras(filme3.duracaoMinutos));
		System.out.println();
		
		//Filme 4
		
		testeFilme filme4 = new testeFilme();
		filme4.nome = "O Pequenino";
		filme4.duracaoMinutos = 98;
		
		System.out.println(filme4.nome);
		System.out.println(filme4.duracaoMinutos+ " minutos");
		System.out.println(filme4.exibirDuracaoHoras(filme4.duracaoMinutos));
		System.out.println(); 
		
		//Filme 5
		
		testeFilme filme5 = new testeFilme();
		filme5.nome = "Um Time Show de Bola";
		filme5.duracaoMinutos = 106;
		
		System.out.println(filme5.nome);
		System.out.println(filme5.duracaoMinutos+ " minutos");
		System.out.println(filme5.exibirDuracaoHoras(filme5.duracaoMinutos));
		System.out.println();
		
	}

}
