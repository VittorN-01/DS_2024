import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int escolha;
        double larguraMts, alturaMts;
        double ladosDec;
        double compOct;
        double diaMa , diaMe;
        double baMa, baMe, altura;
        boolean continuar = true;
        String r = "";
        
        while(continuar) {
        System.out.println("Calcular área de qual Forma Geométrica?");
        System.out.println("1- Decágono");
        System.out.println("2- Losango ");
        System.out.println("3- Octógono");
        System.out.println("4- Retângulo");
        System.out.println("5- Trapézio");
        escolha = in.nextInt();
        
        switch (escolha) {
        case 1:
        	do {
        		System.out.print("Lados: ");
        		ladosDec = in.nextDouble();
            
        		Lados qL = new Lados(ladosDec);
        		Decágono decagono = new Decágono(qL);
            
        		decagono.mostrar(); 
            
        		System.out.println("Calcular novamente ? S/N");
        		r = in.next();
        	}while(r.equalsIgnoreCase("s"));
        	break;
        case 2:
        	do {
	        	System.out.print("Diagonal Maior: ");
	            diaMa = in.nextDouble();
	            System.out.print("Diagonal Menor: ");
	            diaMe = in.nextDouble();
	            
	            Losango losango = new Losango(diaMa, diaMe);
	            
	            losango.mostrar();
	        	System.out.println("Calcular novamente ? S/N");
        		r = in.next();
        	}while(r.equalsIgnoreCase("s"));
        	break;
        case 3:
        	do {
	        	System.out.print("Comprimento: ");
	            compOct = in.nextDouble();
	            
	            Lados cL = new Lados(compOct);
	            Octógono octogono = new Octógono (cL);
	            
	            octogono.mostrar();
	        	System.out.println("Calcular novamente ? S/N");
        		r = in.next();
        	}while(r.equalsIgnoreCase("s"));
        	break;
        case 4:
        	do {
	        	System.out.print("Largura: ");
	            larguraMts = in.nextDouble();
	            System.out.print("Altura: ");
	            alturaMts = in.nextDouble();
	
	            Largura l= new Largura(larguraMts);
	            Altura a = new Altura(alturaMts);
	            Retangulo retangulo= new Retangulo(l, a);
	            
	            retangulo.mostrar();
	        	System.out.println("Calcular novamente ? S/N");
        		r = in.next();
        	}while(r.equalsIgnoreCase("s"));
        	break;
        case 5:
	        	do {
	        	System.out.print("Base Maior: ");
	            baMa = in.nextDouble();
	            System.out.print("Base Menor: ");
	            baMe = in.nextDouble();
	            System.out.print("Altura: ");
	            altura = in.nextDouble();    
	            
	            Altura alt = new Altura (altura);
	            Trapézio trapezio = new Trapézio(baMa, baMe, alt);
	            
	            trapezio.mostrar();
	        	System.out.println("Calcular novamente ? S/N");
        		r = in.next();
        	}while(r.equalsIgnoreCase("s"));
        	break;
        default:
        	System.out.println("Inválido");
        	break;
        }
        
        System.out.println("Calcular a Área de outra Forma Geométrica ? S/N");
        char resp = in.next().charAt(0);
        
        if(resp == 'N' || resp == 'n') {
        	continuar = false;
        	System.out.println("Programa encerrado");
        }
     }
        in.close();
    }
}
