import java.util.Scanner;
public class ParImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		
		System.out.print("Digite um N�mero: ");
		num = in.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("N�mero Par");
		}else {
			System.out.println("N�mero �mpar");
		}
		in.close();
	}
}


