public class ContaPoupanša extends Conta {
	private double percentualRendimento = 0.01;
	
	public double atualizarSaldo() {
		return this.saldo += this.percentualRendimento;
	}
}
