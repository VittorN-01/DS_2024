import java.util.Scanner;
public class ParImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		
		System.out.print("Digite um Número: ");
		num = in.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Número Par");
		}else {
			System.out.println("Número Ímpar");
		}
		in.close();
	}
}


