import java.text.DecimalFormat;
public class mainProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat deci = new DecimalFormat("0.00");
		
		
		/*Objeto 1*/
		Produto produto1 = new Produto();
		
		/* Pede as Informações do Produto*/
		System.out.println("Produto 1:");
		produto1.setNome("");
		produto1.setPrecoCusto(0.0);
		produto1.setPrecoVenda(0.0);
		produto1.calcularMargemLucro(produto1.getPrecoVenda(), produto1.getPrecoCusto());
		
		System.out.println();
        System.out.println("Nome do produto: " + produto1.getNomeProduto());
        System.out.println("Preço de custo: R$" + produto1.getPrecoCusto());
        System.out.println("Preço de venda: R$" + produto1.getPrecoVenda());
        System.out.println("Margem de lucro: R$" + deci.format(produto1.getMargemLucro()));
        System.out.println("Margem de lucro (%): " + deci.format(produto1.getMLucroPorcentual()) + "%");
        System.out.println();
        
        /*Objeto 2*/
        Produto produto2 = new Produto();
        
        System.out.println("Produto 2");
        produto2.setNome("");
        produto2.setPrecoCusto(0);
        produto2.setPrecoVenda(0);
        produto2.calcularMargemLucro(produto2.getPrecoVenda(), produto2.getPrecoCusto());
        
        System.out.println();
        System.out.println("Nome do produto: " + produto2.getNomeProduto());
        System.out.println("Preço de custo: R$" + produto2.getPrecoCusto());
        System.out.println("Preço de venda: R$" + produto2.getPrecoVenda());
        System.out.println("Margem de lucro: R$" + deci.format(produto2.getMargemLucro()));
        System.out.println("Margem de lucro (%): " + deci.format(produto2.getMLucroPorcentual()) + "%");
        System.out.println();
        
        /*Objeto 3*/
        Produto produto3 = new Produto();
        
        System.out.println("Produto 3");
        produto3.setNome("");
        produto3.setPrecoCusto(0);
        produto3.setPrecoVenda(0);
        produto3.calcularMargemLucro(produto2.getPrecoVenda(), produto2.getPrecoCusto());
        
        System.out.println();
        System.out.println("Nome do produto: " + produto3.getNomeProduto());
        System.out.println("Preço de custo: R$" + produto3.getPrecoCusto());
        System.out.println("Preço de venda: R$" + produto3.getPrecoVenda());
        System.out.println("Margem de lucro: R$" + deci.format(produto3.getMargemLucro()));
        System.out.println("Margem de lucro (%): " + deci.format(produto3.getMLucroPorcentual()) + "%");
        System.out.println();
        
	}	

}
