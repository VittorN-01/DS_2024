public class Principal {

    public static void main(String[] args) {
        // Conta Corrente
        cCorrente contaCorrente = new cCorrente("João Silva", "123.456.789-00", 5000, 1234, 1000);
        contaCorrente.verificarSaldo(); // saldo = 5000
        contaCorrente.depositeValor(1000); // saldo+= 1000 
        contaCorrente.sacarValor(6000); // saldo-= 6000 
        System.out.println();
        
        // Conta Poupança
        cPoupanca contaPoupanca = new cPoupanca("Maria Souza", "987.654.321-00", 10000, 1234);
        contaPoupanca.verificarSaldo(); // saldo = 10000
        contaPoupanca.rendMensal(2);  // saldo += 10000 * (2 / 100.0) || saldo = 10200.0
        System.out.println();
        
        // -------------------------------
        Conta conta = new cCorrente("Carlos Pereira", "456.789.123-00", 2000, 1234, 500);
        conta.verificarSaldo();  // saldo = 2000
        conta.depositeValor(500); // saldo+= 500
        conta.sacarValor(2500); // saldo -= 25000
        System.out.println();
        
        conta = new cPoupanca("Ana Lima", "321.654.987-00", 15000, 1234);
        conta.verificarSaldo();  // saldo = 15000
        ((cPoupanca) conta).rendMensal(3); // saldo += 15000 * (3 / 100.0) || saldo = 15450.0
    }
}
