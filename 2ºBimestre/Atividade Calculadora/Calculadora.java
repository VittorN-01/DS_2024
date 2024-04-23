class Calculadora {
    private double resultado;

// Construtor
    public Calculadora() {
        this.resultado = 0;
    }

    public double getResultado() {
        return resultado;
    }

    public void soma(double... numeros) {
        resultado = 0;
        for (double num : numeros) {
            resultado += num;
        }
    }

    public void subtracao(double... numeros) {
        if (numeros.length > 0) {
            resultado = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                resultado -= numeros[i];
            }
        }
    }
}


