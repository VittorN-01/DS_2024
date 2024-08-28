public class Oct�gono {
	private Lados lados;
	private double area;
	
	public Oct�gono(Lados l) {
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
        return "\n Dec�gono:\n Lados = " + lados.forma() + ";\n �rea  = " + area;        
    }

    public void mostrar() {
        System.out.println(forma());
    }
}
