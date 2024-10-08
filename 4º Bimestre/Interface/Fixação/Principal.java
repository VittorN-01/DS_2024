public class Principal {

    public static void main(String[] args) {
        // Conta Corrente
    	System.out.println("Conta Corrente");
        cCorrente contaC1 = new cCorrente("João Silva", "123.456.789-00", 5000, 0000, 1000);
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
        cPoupanca contaP1 = new cPoupanca("Maria Souza", "987.654.321-00", 10000, 1111);
        contaP1.verificarSaldo(); // saldo = 10000
        contaP1.rendMensal();
        System.out.println();
        
        // -------------------------------
        System.out.println("-------------------------------");
        System.out.println("Conta Corrente 2");
        Conta conta = new cCorrente("Carlos Pereira", "456.789.123-00", 2000, 1234, 500);
        conta.verificarSaldo();  // saldo = 2000
        System.out.println();
        System.out.println("Depositar*");
        conta.depositeValor(); 
        System.out.println();
        System.out.println("Sacar*");
        conta.sacarValor(); 
        System.out.println();
        
        System.out.println("Conta Poupança 2");
        conta = new cPoupanca("Ana Lima", "321.654.987-00", 15000, 4321);
        conta.verificarSaldo();  // saldo = 15000
        ((cPoupanca) conta).rendMensal(); 
    }
}
