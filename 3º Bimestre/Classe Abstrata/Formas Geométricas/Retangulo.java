public class Retangulo {
	private Largura largura; 
	private Altura altura;
	private double area;
	
	public Retangulo(Largura l, Altura a) {
		largura = l;
		altura = a;
		calcularArea();
	}
	
	private void calcularArea() {
        area = largura.getValor() * altura.getValor();
    }
    
    public double getArea() {
        return area;
    }
    
    public String forma() {
        return "\n Retangulo:\n Largura = " + largura.forma() + ";\n Altura  = " + altura.forma() + ";\n Área = " + area;        
    }

    public void mostrar() {
        System.out.println(forma());
    }

}
