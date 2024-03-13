public class mainFuncionario {

    public static void main(String[] args) {
        Funcionarios Pedro = new Funcionarios();
        System.out.println("Pedro:");
        Pedro.SalarioBruto = 5000;
        System.out.println("Salário Bruto: "+ Pedro.SalarioBruto);
        Pedro.Imposto = 1500;
        System.out.println("Imposto: "+ Pedro.Imposto);
        System.out.println("Salário Liquido: " + Pedro.salarioLiquido());
        System.out.println("Salário com aumento: " + Pedro.aumentarSalario());


		
		
		System.out.println("Vagner:");
		Funcionarios Vagner = new Funcionarios();
		Vagner.SalarioBruto = 3500;
		System.out.println("Salário Bruto:"+ Vagner.SalarioBruto);
		Vagner.Imposto = 1000;
		System.out.println("Imposto:"+ Vagner.Imposto);		
		System.out.println("Salário Liquido: "+ Vagner.salarioLiquido());
		System.out.println("Salário com aumento: " + Vagner.aumentarSalario());
		
	}

}
