public abstract class cGenerica implements Conta {
    private String nome;
    private String cpf;
    protected double saldo; 
    private int senha;
    
    public cGenerica() {
    }
    public cGenerica(String nome, String cpf, double saldo, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositeValor(double v) {
        if (senha != 1234) {
            System.out.println("Senha incorreta. Não poderá depositar");
        } else {
            this.saldo += v; 
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
        }
    }

    public void sacarValor(double v) {
        if (senha != 1234) {
            System.out.println("Senha incorreta. Não poderá sacar");
        } else {
            if (v > saldo) {
                System.out.println("Valor de saque maior que o saldo.");
            } else {
                this.saldo -= v; 
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
            }
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo da conta: " + this.saldo);
    }
}
