public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Objeto Revista
		Revista rev1 = new Revista();
		System.out.println("Revista 1:");
		rev1.setTitulo("AA");
		rev1.setAutor("BB");
		rev1.setAnoPublicacao(2012);
		rev1.setNumEdicao(3);
		rev1.setMesPublicacao(null);
		rev1.exibirDetalhes();
		
		System.out.println();
		// Objeto Livro
		Livro liv1 = new Livro();
		System.out.println("Livro 1:");
		liv1.setTitulo("CC");
		liv1.setAutor("DD");
		liv1.setAnoPublicacao(2000);
		liv1.setNumeroPaginas(230);
		liv1.setEditora("Piracanjuba");
		liv1.exibirDetalhes();
		
	}

}
