public class cCorrente extends cGenerica {
    private double chequeEspecial;

    public cCorrente(String nome, String cpf, double saldo, int senha, double cheque) {
        super(nome, cpf, saldo, senha);
        this.chequeEspecial = cheque;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public void sacarValor(double v) {
        if (v <= saldo + chequeEspecial) {
            this.saldo -= v;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saque não permitido. Limite de cheque especial excedido.");
        }
    }
}
