public class Altura {
	private double metros;
	
	public Altura(double m) {
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
