import java.util.Scanner;
public class Alunos {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[][] = new int [3][4];
		int i, j;
		
		for (i = 0; i < 3; i++) {
	        for (j = 0; j < 4; j++) {
	        	System.out.print("Entre com a "+(j+1)+"ª nota do " + (i+1) + "º aluno: ");
	            a[i][j] = in.nextInt();
	        }
		}
		
		for (i = 0; i < 3; i++) {
	    	System.out.println();
	    	System.out.print("Aluno "+(i+1)+": ");
	        for (j = 0; j < 4; j++) {
	            System.out.print(a[i][j] + " ");
	        }
	    }
	}

}
