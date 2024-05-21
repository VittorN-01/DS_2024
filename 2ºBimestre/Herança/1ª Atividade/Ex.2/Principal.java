public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente();
		System.out.println("Cliente 1:");
		cliente1.setNome("Fábio");
		cliente1.setIdade(25);
		cliente1.setEndereco("Rua Quintanilia");
		cliente1.setValorPedido(150);
		
		System.out.println("Nome: "+ cliente1.getNome());
		System.out.println("Idade: "+cliente1.getIdade());
		System.out.println("Endereço: "+ cliente1.getEndereco());
		System.out.println("Valor do Pedido: "+cliente1.getValorPedido());
		System.out.println("Desconto: R$"+ cliente1.valorDesc());
		System.out.println("Valor com Desconto: R$"+ cliente1.calculaDesconto());
		System.out.println();
		
		ClientePremium cliente2 = new ClientePremium();
		System.out.println("Cliente 2:");
		cliente2.setNome("Lucas");
		cliente2.setIdade(27);
		cliente2.setEndereco("Rua Fernando");
		cliente2.setValorPedido(250);
		
		System.out.println("Nome: "+ cliente2.getNome());
		System.out.println("Idade: "+cliente2.getIdade());
		System.out.println("Endereço: "+ cliente2.getEndereco());
		System.out.println("Valor do Pedido: "+cliente2.getValorPedido());
		System.out.println("Desconto: R$"+ cliente2.valorDesc());
		System.out.println("Valor com Desconto: R$"+ cliente2.calculaDesconto());
		System.out.println();
		
	}

}
