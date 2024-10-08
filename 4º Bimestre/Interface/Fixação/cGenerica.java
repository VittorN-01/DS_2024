import java.util.Scanner;
public abstract class cGenerica implements Conta {
    Scanner in = new Scanner(System.in);
	
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

    public void depositeValor() {
        System.out.print("Valor para depósito: ");
        double v = in.nextDouble();
        boolean senhaCorreta = false;
        
        while (!senhaCorreta) {
            System.out.print("Digite sua senha: ");
            int tentativaSenha = in.nextInt();

            if (tentativaSenha != this.senha) {
                System.out.println("Senha incorreta. Tente novamente.");
            } else {
                this.saldo += v;
                System.out.println("Depósito realizado com sucesso. \nNovo saldo: " + saldo);
                senhaCorreta = true;
            }
        }
    }

    public void sacarValor() {
    	System.out.print("Valor para saque: ");
    	double v = in.nextDouble();
        boolean senhaCorreta = false;
        
        while (!senhaCorreta) {
            System.out.print("Digite sua senha: ");
            int tentSenha = in.nextInt();

            if (tentSenha != this.senha) {
                System.out.println("Senha incorreta. Tente novamente.");
            } else {
                if (v > saldo) {
                    System.out.println("Valor de saque maior que o saldo.");
                } else {
                    this.saldo -= v;
                    System.out.println("Saque realizado com sucesso. \nNovo saldo: " + saldo);
                }
                senhaCorreta = true;
            }
        }
    }

    public void dadosConta() {
    	System.out.println("Nome: " + this.nome);
    	System.out.println("Cpf: " + this.cpf);
    	System.out.println("Senha: " + this.senha);
    }

    public void verificarSaldo() {
        System.out.println("Saldo da conta: " + this.saldo);
    }
}
