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
    public void sacarValor() {
        System.out.print("Digite sua senha: ");
        boolean senhaCorreta = false;
        
        while (!senhaCorreta) {
            int tentSenha = in.nextInt();

            if (tentSenha != this.getSenha()) {
                System.out.println("Senha incorreta. Tente novamente.");
            } else {
                System.out.print("Valor para saque: ");
                double v = in.nextDouble();
                
                if (v <= saldo + chequeEspecial) {
                    this.saldo -= v;
                    System.out.println("Saque realizado com sucesso. \nNovo saldo: " + saldo);
                } else {
                    System.out.println("Saque não permitido. Limite de cheque especial excedido.");
                }
                senhaCorreta = true;
            }
        }
    }

}
