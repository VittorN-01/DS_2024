public class ClientePremium extends Cliente {
	
	
	@Override 
	public double valorDesc(){
		return 0.15 * super.getValorPedido();
	}
}
