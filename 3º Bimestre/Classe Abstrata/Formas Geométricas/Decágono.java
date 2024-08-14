public class Dec�gono {
	private Lados lados;
	private double area;
	
	public Dec�gono(Lados l) {
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
        return "\n Dec�gono:\n Lados = " + lados.forma() + ";\n �rea  = " + area;        
    }

    public void mostrar() {
        System.out.println(forma());
    }

	
}
