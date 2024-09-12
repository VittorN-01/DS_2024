public class Conta {
	private String nome;
	private String CPF;
	private String numeroConta;
	public double saldo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome =nome;
	}
	
	public String getCpf() {
		return CPF;
	}
	
	public void setCpf(String CPF) {
		this.CPF = CPF;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double depositar(double quantia) {
		return this.saldo += quantia;
	}
	public double sacar (double quantia) {
		return this.saldo -= quantia;
	}
	public void imprimirSaldo() {
		System.out.println();
	}
	
}
