import java.util.Scanner;
public class cPoupanca extends cGenerica {
	Scanner in = new Scanner (System.in);
	
    public cPoupanca(String nome, String cpf, double saldo, int senha) {
        super(nome, cpf, saldo, senha);
    }

    public void rendMensal() {
    	System.out.print("Digite a taxa: ");
        double taxa = in.nextDouble();
    	double rend = saldo * (taxa / 100.0); 
        this.saldo += rend; 
        System.out.println("Rendimento aplicado. \nNovo saldo: " + saldo);
    }
}
