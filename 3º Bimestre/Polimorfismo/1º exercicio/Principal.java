import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		String r = "";
		
		Conta c1 = new Conta();
		System.out.print("Nome: ");
		c1.setNome(in.next());
		System.out.print("CPF: ");
		c1.setCpf(in.next());
		System.out.print("Nº da Conta: ");
		c1.setNumeroConta(in.next());
		c1.setSaldo(5000);
		System.out.println();
		System.out.println("Nome: "+c1.getNome());
		System.out.println("CPF: "+c1.getCpf());
		System.out.println("Nº da Conta: "+c1.getNumeroConta());
		System.out.println("Saldo: "+c1.getSaldo());
		System.out.println();
		System.out.println("Deseja depositar ou sacar? D ou S");
		r = in.next();
		if(r.equalsIgnoreCase("d")) {
			System.out.println("Quanto deseja depositar? ");
			c1.depositar(in.nextDouble());
			System.out.println("Novo saldo: "+c1.saldo);
		}else if (r.equalsIgnoreCase("s")) {
			System.out.println("Quanto deseja sacar? ");
			c1.sacar(in.nextDouble());
			System.out.println("Novo saldo: "+c1.saldo);
		}
		System.out.println("-------------------------------");
		System.out.println();
		ContaCorrente cCorrente1 = new ContaCorrente();
		System.out.print("Nome: ");
		cCorrente1.setNome(in.next());
		System.out.print("CPF: ");
		cCorrente1.setCpf(in.next());
		System.out.print("Nº da Conta: ");
		cCorrente1.setNumeroConta(in.next());
		cCorrente1.setSaldo(1000);
		System.out.println();
		System.out.println("Nome: "+cCorrente1.getNome());
		System.out.println("CPF: "+cCorrente1.getCpf());
		System.out.println("Nº da Conta: "+cCorrente1.getNumeroConta());
		System.out.println("Saldo: "+cCorrente1.getSaldo());
		System.out.println();
		System.out.println("Deseja depositar ou sacar? D ou S");
		r = in.next();
		if(r.equalsIgnoreCase("d")) {
			System.out.println("Quanto deseja depositar? ");
			cCorrente1.depositar(in.nextDouble());
			System.out.println("Novo saldo: "+cCorrente1.saldo);
		}else if (r.equalsIgnoreCase("s")) {
			System.out.println("Quanto deseja sacar? ");
			cCorrente1.sacar(in.nextDouble());
			System.out.println("Novo saldo: "+cCorrente1.saldo);
		}
		System.out.println("-------------------------------");
		System.out.println();
		ContaPoupança cPoupanca1 = new ContaPoupança();
		System.out.print("Nome: ");
		cPoupanca1.setNome(in.next());
		System.out.print("CPF: ");
		cPoupanca1.setCpf(in.next());
		System.out.print("Nº da Conta: ");
		cPoupanca1.setNumeroConta(in.next());
		cPoupanca1.setSaldo(1000);
		cPoupanca1.atualizarSaldo();
		System.out.println("-------------------------------");
		System.out.println("Nome: "+cPoupanca1.getNome());
		System.out.println("CPF: "+cPoupanca1.getCpf());
		System.out.println("Nº da Conta: "+cPoupanca1.getNumeroConta());
		System.out.println("Saldo: "+cPoupanca1.getSaldo());
		System.out.println();
		System.out.println("Deseja depositar ou sacar? D ou S");
		r = in.next();
		if(r.equalsIgnoreCase("d")) {
			System.out.println("Quanto deseja depositar? ");
			cPoupanca1.depositar(in.nextDouble());
			System.out.println("Novo saldo: "+cPoupanca1.saldo);
		}else if (r.equalsIgnoreCase("s")) {
			System.out.println("Quanto deseja sacar? ");
			cPoupanca1.sacar(in.nextDouble());
			System.out.println("Novo saldo: "+cPoupanca1.saldo);
		}
		System.out.println("---------------------------");
		System.out.println();
		Lucros l1 = new Lucros();
		
		l1.registra(c1);
		l1.registra(cCorrente1);
		l1.registra(cPoupanca1);
		
		System.out.println("Lucros: "+l1.getSoma());
	}

}
