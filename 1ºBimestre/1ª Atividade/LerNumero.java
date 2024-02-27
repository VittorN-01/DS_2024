import java.util.Scanner;
public class LerNumero {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int num;
		System.out.print("Digite um número: ");
		num = in.nextInt();
		
		if (num >= 1) {
			System.out.println("Número Positivo");
		}else if (num == 0) {
			System.out.println("Número Neutro");
		}else {
			System.out.println("Número Negativo");
		}
		in.close();
	}
}


