import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		String catalogo[];
		int i;
		final int TAM=10;
		catalogo = new String [TAM];
		
		
		
		do {
			Filme f1 = new Filme();		 
			for(i=1; i<=5; i++) {
				System.out.println("\n");
				System.out.println("Filme: ");
				f1.setCategoria(in.next());
				f1.setTitulo(in.next());
				f1.setDuracao(in.nextInt());
				System.out.println("\n");
				f1.descricao();
			}
			Serie s1 = new Serie();
			for(i=5; i <TAM; i++) {
				System.out.println("\n");
				System.out.println("Série:");
				s1.setCategoria(in.next());
				s1.setTitulo(in.next());
				s1.setDuraao(in.nextInt());
				s1.setQuantEpisodios(in.nextInt());
				s1.setquantTemps(in.nextInt());
				System.out.println("\n");
				s1.descricao();
			}
		}while (i<TAM);		
		in.close();
	}

}
