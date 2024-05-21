public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro car1 = new Carro();
		System.out.println("CARRO: ");
		car1.setMarca("Porsche");
		car1.setModelo("911");
		car1.setAno(2024);
		car1.setCor("Azul Gentian Metálico");
		car1.setQntPorta(2);
		
		System.out.println("Marca: "+car1.getMarca());
		System.out.println("Modelo: "+car1.getModelo());
		System.out.println("Ano: "+car1.getAno());
		System.out.println("Cor: "+car1.getCor());
		System.out.println("Quantidade de Portas: "+car1.getQntPorta());
		System.out.println();
		//MOTO
		 Moto moto1 = new Moto();
		 System.out.println("MOTO: ");
		 moto1.setMarca("Honda");
		 moto1.setModelo("Bros 160");
		 moto1.setAno(2024);
		 moto1.setCor("Vermelho - Fighting Red");
		 moto1.setCilindradas(162.7);
		 System.out.println("Marca: "+moto1.getMarca());
		 System.out.println("Modelo: "+moto1.getModelo());
		 System.out.println("Ano: "+moto1.getAno());
		 System.out.println("Cor: "+moto1.getCor());
		 System.out.println("Cilindradas: "+moto1.getCilindradas() + " cc");
		 
		 
	}

}
