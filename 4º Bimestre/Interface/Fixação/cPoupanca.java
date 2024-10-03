public class cPoupanca extends cGenerica { 
    public cPoupanca(String nome, String cpf, double saldo, int senha) {
        super(nome, cpf, saldo, senha);
    }

    public void rendMensal(double taxa) {
        double rend = saldo * (taxa / 100.0); 
        this.saldo += rend; 
        System.out.println("Rendimento aplicado. Novo saldo: " + saldo);
    }
}
