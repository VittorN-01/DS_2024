public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Carros
		Carro car1 = new Carro();
		System.out.println("Detalhes do Carro 1 ");
		car1.setModelo(null);
		car1.setValorTabela(0);
		car1.setCor(null);
		car1.setCombustivel(null);
		car1.calcularIpva(car1.getValorTabela());
		System.out.println();
		
		Carro car2 = new Carro();
		System.out.println("Detalhes do Carro 2");
		car2.setModelo(null);
		car2.setValorTabela(0);
		car2.setCor(null);
		car2.setCombustivel(null);
		car2.calcularIpva(car2.getValorTabela());
		System.out.println();
		// Apresentando
		System.out.println("Carro 1");
		car1.imprimirFicha();
		System.out.println();
		System.out.println("Carro 2");
		car2.imprimirFicha();
		System.out.println();
		
		// Motos
		Moto moto1 = new Moto();
		System.out.println("Detalhes da Moto 1 ");
		moto1.setModelo(null);
		moto1.setValorTabela(0);
		moto1.setCor(null);
		moto1.setCombustivel(null);
		moto1.calcularIpva(moto1.getValorTabela());
		System.out.println();
		
		Moto moto2 = new Moto();
		System.out.println("Detalhes da Moto 2");
		moto2.setModelo(null);
		moto2.setValorTabela(0);
		moto2.setCor(null);
		moto2.setCombustivel(null);
		moto2.calcularIpva(moto2.getValorTabela());
		System.out.println();
		// Apresentando
		System.out.println("Moto 1");
		moto1.imprimirFicha();
		System.out.println();
		System.out.println("Moto 2");
		moto2.imprimirFicha();
		
		
	}

}
