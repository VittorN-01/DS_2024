import java.text.DecimalFormat;
public class mainImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat deci = new DecimalFormat("0.000");
		
		imc pessoa1 = new imc();
		System.out.println("Pessoa 1");
		pessoa1.cadastroNome();
		pessoa1.cadastroIdade();
		System.out.println("IMC: "+deci.format(pessoa1.calcularIMC()));
		System.out.println();
		System.out.println("--> Registrado no Banco de Dados");
		System.out.println();
		
		
		System.out.println("Pessoa 2");
		imc pessoa2 = new imc();
		pessoa2.cadastroNome();
		pessoa2.cadastroIdade();
		System.out.println("IMC: "+deci.format(pessoa2.calcularIMC()));
		System.out.println();
		System.out.println("--> Registrado no Banco de Dados");
		System.out.println();
		
		
		System.out.println("Pessoa 3");
		imc pessoa3 = new imc();
		pessoa3.cadastroNome();
		pessoa3.cadastroIdade();
		System.out.println("IMC: "+deci.format(pessoa3.calcularIMC()));
		System.out.println();
		System.out.println("--> Registrado no Banco de Dados");
		System.out.println();
		
		
		System.out.println("Pessoa 4");
		imc pessoa4 = new imc();
		pessoa4.cadastroNome();
		pessoa4.cadastroIdade();
		System.out.println("IMC: "+deci.format(pessoa4.calcularIMC()));
		System.out.println();
		System.out.println("-->  Registrado no Banco de Dados");
		System.out.println();
		
		
		
	}

}
