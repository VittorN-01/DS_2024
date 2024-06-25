import java.util.Scanner;
public class Veículo {
	Scanner in = new Scanner(System.in);
	
	// Atributos
	private String modelo;
	private double valorTabela;
	private String cor;
	private String combustivel;
	private double ipva;
	
	// Construtores
	public Veículo () {
	}
	public Veículo(String modelo, double valorTabela, String cor, String combustivel, double ipva) {
		this.modelo = modelo;
		this.valorTabela = valorTabela;
		this.cor = cor;
		this.combustivel = combustivel;
		this.ipva = ipva;		
	}
	
	// Métodos
	// Getter e Setters
	
	// Modelo
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		System.out.print("Coloque o modelo: ");
		this.modelo = in.next();
	}
	// ---
	// Valor Tabela
	public double getValorTabela() {
		return this.valorTabela;
	}
	public void setValorTabela(double valorTabela) {
		System.out.print("Coloque o Valor Tabela: ");
		this.valorTabela = in.nextDouble();
	}
	// ---
	// Cor
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		System.out.print("Coloque a cor: ");
		this.cor = in.next();
	}
	// ---
	// Combustível
	public String getCombustivel() {
		return this.combustivel;
	}
	public void setCombustivel(String combustivel) {
		System.out.print("Coloque o tipo de combustível: ");
		this.combustivel = in.next();	
	}
	// ---
	// Ipva
	public double getIpva() {
		return this.ipva;
	}
	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	// Calcular Ipva
	public double calcularIpva(double valorTabela) {
		double aliquota = 1;
		this.ipva = valorTabela*(aliquota/100)/100;	 		
		return this.ipva;
	}
	
	// Imprimir
	public void imprimirFicha() {
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Valor Tabela (Valor Venal): "+this.getValorTabela());
		System.out.println("Cor: "+this.getCor());
		System.out.println("Combustível: "+this.getCombustivel());
		System.out.println("Ipva: "+this.calcularIpva(getValorTabela())+"%");
	}
	
	
}
