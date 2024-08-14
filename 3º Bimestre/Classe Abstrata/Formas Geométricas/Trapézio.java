public class Trap�zio {
	private double baMa;
	private double baMe;
	private Altura altura;
	private double area;
	
	public Trap�zio(double bMa, double bMe, Altura alt) {
		this.baMa = bMa;
		this.baMe = bMe;
		altura = alt;
		calcularArea();
	}
	
	private void calcularArea() {
		area = ((baMa+baMe) * altura.getValor()) / 2;
	}
	
	public double getArea() {
        return area;
    }
    
    public String forma() {
        return "\n Losango:\n Base Maior = " + baMa + "\n Base Menor = " + baMe +"\n Altura = " + altura.forma() + ";\n �rea  = " + area;        
    }

    public void mostrar() {
        System.out.println(forma());
    }
}
