public class Largura {
	private double metros;
	
	public Largura(double m) {
		this.metros = m;
	}
	
	public double getValor() {
        return metros;
    }
	
	public String forma() {
		return String.valueOf(metros);
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
}
