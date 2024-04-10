
public class testeFilme {
	String nome;
	int duracaoMinutos;
	
	
	
	String getNome() {
		return nome;
	}
	
	void setNome() {
		this.nome = nome;
	}
	
	int getMinutos() { 
		return duracaoMinutos;
	}
	void setduracaoMinutos() {
		this.duracaoMinutos = duracaoMinutos;
	}

	String exibirDuracaoHoras(int duracaoMinutos) {
        	int horas = duracaoMinutos / 60;
        	int minutos = duracaoMinutos % 60;
        	return String.format("%02d:%02d:00", horas, minutos);
    }
	
	
}
