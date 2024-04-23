import java.util.Scanner;
public class mainCalculadora {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
        String continuar;
        double a[];
        int qnt;
        
        do{
            Calculadora calculadora1 = new Calculadora();

            System.out.println("Quantos números você deseja somar e subtrair?");
            qnt = in.nextInt();
            a = new double[qnt];
            
            System.out.println("Digite os números");
            for (int i = 0; i < qnt; i++) {
            	System.out.print("Digite o "+ (i+1) + " valor: ");
                a[i] = in.nextDouble();
            }
            
            // Somando e Subtraindo
            calculadora1.soma(a);
            System.out.println("Soma: " + calculadora1.getResultado());
            
            calculadora1.subtracao(a);         
            System.out.println("Subtração: " + calculadora1.getResultado());
            
            System.out.println();
            // Perguntando
            System.out.println("Deseja continuar? (S/N)");
            continuar = in.next();
            
            if(continuar.equalsIgnoreCase("N")) {
            	System.out.println("Obrigado por utilizar o programa");
            }
            
        }while (continuar.equalsIgnoreCase("S"));
        in.close();
	}
}