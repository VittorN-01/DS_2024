import java.util.Scanner;
public class SenhaCorreta {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int senha = 0;
		
		while (senha != 2002) {
			System.out.print("Digite a senha de 4 dig�tos: ");
			senha = in.nextInt();
			if (senha != 2002) {
				System.out.println("Senha Inv�lida");
			}else {
				System.out.println("Acesso Permitido");
			}
		}
		in.close();
	}
	}
	


