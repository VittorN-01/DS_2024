public class Carro extends Veículo{
	@Override
	public double calcularIpva(double valorTabela) {
		super.calcularIpva(getValorTabela());
		return valorTabela*0.04/100;
	}
}
