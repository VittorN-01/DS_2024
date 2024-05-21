public class ClientePremium extends Cliente {
	
	
	@Override 
	public double calculaDesconto( ){
		return 0.10 * super.getValorPromocinal();
	}
}
