import java.util.Scanner;

public class Funcionarios {
    String Nome;
    double SalarioBruto;
    double Imposto;

    Double salarioLiquido() {
        double SalarioLiquido = SalarioBruto - (Imposto);
        return SalarioLiquido;
    }

    Double aumentarSalario() {
        Scanner in = new Scanner(System.in);
        System.out.print("Aumento (double): ");
        double aumento = in.nextDouble();

        SalarioBruto += aumento;

        
        return SalarioBruto;
    }
}
