public class Moto extends Veículo{
	@Override
	public double calcularIpva(double valorTabela) {
		super.calcularIpva(getValorTabela());
		return valorTabela*0.02/100;
	}
}
