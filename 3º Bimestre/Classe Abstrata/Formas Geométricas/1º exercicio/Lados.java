public class Lados {
	private double qntLados;
	
	public Lados(double qL) {
		this.qntLados = qL;
	}
	
	public double getValor() {
        return qntLados;
    }
	public String forma() {
		return String.valueOf(qntLados);
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
	
}
