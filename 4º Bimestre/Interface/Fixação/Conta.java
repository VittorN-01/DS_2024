public interface Conta {
	// Atributos
	String getNome();
    void setNome(String nome);
    String getCpf();
    void setCpf(String cpf);
    int getSenha();
    void setSenha(int senha);
    double getSaldo();
    
    // M�todos
    void depositeValor(double v);
    void sacarValor(double v);
    void verificarSaldo();	
}
