import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
    	Scanner in = new Scanner (System.in);
    	
    	// Conta Corrente
    	System.out.println("Conta Corrente");
    	System.out.println("Coloque seu nome e seu CPF");
        cCorrente contaC1 = new cCorrente(in.next(), in.next(), 5000, 5555, 1000);
        contaC1.dadosConta();
        contaC1.verificarSaldo(); // saldo = 5000
        System.out.println();
        System.out.println("Depositar*");
        contaC1.depositeValor();
        System.out.println();
        System.out.println("Sacar*");
        contaC1.sacarValor();
        System.out.println();
        
        // Conta Poupança
        System.out.println("Conta Poupança");
        System.out.println("Coloque seu nome e seu CPF");
        cPoupanca contaP1 = new cPoupanca(in.next(), in.next(), 10000, 1111);
        contaP1.dadosConta();
        contaP1.verificarSaldo(); // saldo = 10000
        contaP1.rendMensal();
        System.out.println();
        
        // -------------------------------
        System.out.println("-------------------------------");
        System.out.println("Conta Corrente 2");
        System.out.println("Coloque seu nome e seu CPF");
        Conta conta = new cCorrente(in.next(), in.next(), 2000, 1234, 500);
        conta.dadosConta();
        conta.verificarSaldo();  // saldo = 2000
        System.out.println();
        System.out.println("Depositar*");
        conta.depositeValor(); 
        System.out.println();
        System.out.println("Sacar*");
        conta.sacarValor(); 
        System.out.println();
        
        System.out.println("Conta Poupança 2");
        System.out.println("Coloque seu nome e seu CPF");
        conta = new cPoupanca(in.next(), in.next(), 15000, 4321);
        conta.dadosConta();
        conta.verificarSaldo();  // saldo = 15000
        ((cPoupanca) conta).rendMensal(); 
    }
}
