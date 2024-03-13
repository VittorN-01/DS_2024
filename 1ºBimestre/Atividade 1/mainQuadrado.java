public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Quadrado quadrado1 = new Quadrado();
		quadrado1.altura = 3;
		System.out.println(quadrado1.altura);
		quadrado1.base = 2;
		System.out.println(quadrado1.base);
		System.out.println("Área: "+quadrado1.calcularArea());
		
		
		
		Quadrado quadrado2 = new Quadrado();
		quadrado2.altura = 5;
		System.out.println(quadrado2.altura);
		quadrado2.base = 3;
		System.out.println(quadrado2.base);
		System.out.println("Área: "+quadrado2.calcularArea());
		
	}

}
