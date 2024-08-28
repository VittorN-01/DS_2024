public class Losango {
	private double diaMa;
	private double diaMe;
	private double area;
	
	public Losango(double dMa, double dMe) {
		this.diaMa = dMa;
		this.diaMe = dMe;
		calcularArea();
	}
	
	private void calcularArea() {
		area = (diaMa * diaMe) / 2;
	}
	
	public double getArea() {
        return area;
    }
    
    public String forma() {
        return "\n Losango:\n Diagonal Maior = " + diaMa + "\n Diagonal Menor = " + diaMe + ";\n Área  = " + area;        
    }

    public void mostrar() {
        System.out.println(forma());
    }
	
}
