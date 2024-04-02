import java.util.Scanner;
public class Produto {
	 private String nome;
	 private double precoCusto;
	 private double precoVenda;
	 private double margemLucro;
	 
	 Scanner in = new Scanner(System.in);
	 
	 // Parte 1
	 String getNomeProduto() {
	        return nome;
	 }
	 void setNome(String nome) {
		 System.out.print("Coloque o nome do produto: ");
		 nome = in.next();
		 this.nome = nome;
	 }
	 
	 
	 //Parte 2
	 double getPrecoCusto() {
	        return precoCusto;
	 }
	 void setPrecoCusto(double precoCusto) {
		 System.out.print("Coloque o preço de COMPRA: ");
		 precoCusto = in.nextDouble();
	     this.precoCusto = precoCusto;
	 }
	 
	 
	 //Parte 5
	 Double getPrecoVenda() {
		 return this.precoVenda;
	 }
	 void setPrecoVenda(double precoVenda){
		 System.out.print("Coloque o preço de VENDA: ");
		 precoVenda = in.nextDouble();
		 if(precoVenda < precoCusto) {
			 System.out.println("ALERTA!! Preço de venda menor que o Preço de Custo");
		 }
		 this.precoVenda = precoVenda;
	 }
	 
	 
	//Parte 6
	 Double getMargemLucro() {
	        return margemLucro;
	 }
	 void calcularMargemLucro(double precoVenda, double precoCusto){
		 this.margemLucro = precoVenda - precoCusto;
	 }
	 
	 
	 //Parte 7
	 Double getMLucroPorcentual() {
		 return (margemLucro / precoVenda) * 100;
	 }
}

