import java.util.Scanner;
public class LerNumero {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int num;
		System.out.print("Digite um n�mero: ");
		num = in.nextInt();
		
		if (num >= 1) {
			System.out.println("N�mero Positivo");
		}else if (num == 0) {
			System.out.println("N�mero Neutro");
		}else {
			System.out.println("N�mero Negativo");
		}
		in.close();
	}
}


