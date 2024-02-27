import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int anoNasc, anoAtual, idade;
		String resp;
		
		do {
			System.out.print("Ano de Nascimento: ");
			anoNasc = in.nextInt();
			System.out.print("Ano Atual: ");
			anoAtual = in.nextInt();
		
			idade = anoAtual - anoNasc;
		
			if (idade >= 18) {
				System.out.println(idade+" anos, Maior de idade");
			}else {
				System.out.println(idade+" anos, Menor de idade");
			}
			System.out.println("Deseja calcular a idade de mais uma pessoa? S = Sim ou N = Não");
			resp = in.next();
		}while (resp.equals("S")||resp.equals("s"));
		in.close();
	}

}



