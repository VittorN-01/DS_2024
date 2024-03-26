
public class novoIMC {
	private String Nome;
	private int idade;
	public double altura;
	public double peso;
		
	
	String getNome() {
		return this.Nome;
	}
	
	int getIdade() {
		return this.idade;
	}
	
	Double getAltura() {
		return this.altura;
	}
	
	Double getPeso() {
		return this.peso;
	}
	
	void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	void setIdade(int idade) {
		this.idade = idade;
	}
	
	void setAltura(double altura) {
		this.altura = altura;
	}
	
	void setPeso(double peso) {
		this.peso = peso;
	}
	
	Double calcularIMC() {
		
		double imc = peso / (altura*altura);
		
		if (imc < 18.5) {
			System.out.println("Abaixo do Peso");	
		}else if (imc <=24.9) {
			System.out.println("Peso Normal");
		}else if (imc <=29.9) {
			System.out.println("Sobrepeso");
		}else if (imc <=34.9) {
			System.out.println("Obesidade Grau 1");
		}else if (imc <=39.9) {
			System.out.println("Obesidade Grau 2");
		}else if (imc >=40) {
			System.out.println("Obesidade Grau 3 ");
		}
		
		return imc;
	}
	
}
