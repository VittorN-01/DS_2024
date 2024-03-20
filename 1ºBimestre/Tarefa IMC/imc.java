import java.util.Scanner;

public class imc {
	String Nome;
	int idade;
	double altura;
	double peso;
	
	
	
	String cadastroNome() {
		Scanner in = new Scanner(System.in); 
		System.out.print("Seu Nome: ");
		Nome = in.next();
		return Nome;	
	}
	int cadastroIdade() {
		Scanner in = new Scanner(System.in); 
		System.out.print("Sua Idade: ");
		idade = in.nextInt();
		return idade;
	}
	
	Double calcularIMC() {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a sua Altura (em metros): ");
		altura = in.nextDouble();
		
		System.out.print("Digite o seu peso (em quilos): ");
		peso = in.nextDouble();
		
		double imc = peso / (altura*altura);
		
		if (imc < 18.5) {
			System.out.println("Abaixo do Peso");	
		}else if (imc <=24.9) {
			System.out.println("Peso Normal");
		}else if (imc <=29.9) {
			System.out.println("Sobrepeso");
		}else if (imc <=34.9) {
			System.out.println("Obesidade Grau 1");
		}else if (imc <=39.9) {
			System.out.println("Obesidade Grau 2");
		}else if (imc >=40) {
			System.out.println("Obesidade Grau 3 ");
		}
		
		return imc;
	}
}
