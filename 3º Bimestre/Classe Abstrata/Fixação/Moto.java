public class Moto extends Ve�culo{
	@Override
	public double calcularIpva(double valorTabela) {
		super.calcularIpva(getValorTabela());
		return valorTabela*0.02/100;
	}
}
