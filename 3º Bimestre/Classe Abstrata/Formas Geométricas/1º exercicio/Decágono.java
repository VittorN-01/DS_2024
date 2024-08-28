public class Decágono {
	private Lados lados;
	private double area;
	
	public Decágono(Lados l) {
		this.lados = l;
		calcularArea();
	}
	
	
	private void calcularArea() {
		area =  5/2 * (lados.getValor()*lados.getValor()) * Math.sqrt(5+2 * Math.sqrt(5));
	}
	
	public double getArea() {
        return area;
    }
    
    public String forma() {
        return "\n Decágono:\n Lados = " + lados.forma() + ";\n Área  = " + area;        
    }

    public void mostrar() {
        System.out.println(forma());
    }

	
}
