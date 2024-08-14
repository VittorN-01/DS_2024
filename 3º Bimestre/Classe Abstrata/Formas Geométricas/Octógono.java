public class Octógono {
	private Lados lados;
	private double area;
	
	public Octógono(Lados l) {
		this.lados = l;
		calcularArea();
	}
	
	
	private void calcularArea() {
		area = 2 *(1 + Math.sqrt(2)* (lados.getValor()*lados.getValor()) );
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
