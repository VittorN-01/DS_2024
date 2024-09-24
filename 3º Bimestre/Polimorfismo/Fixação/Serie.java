public class Serie extends Conteudo{
	public int duracao;
	public int quantEpisodios;
	public int quantTemps;
	
	public Serie() {
	}
	public Serie(String t, int d, int qntEp, int qntTemps) {
		super("Série", t);
		this.duracao = d;
		this.quantEpisodios = qntEp;
		this.quantTemps = qntTemps;
	}
	
	public int getDuracao(){
		return duracao;
	}
	public void setDuraao(int duracao) {
		this.duracao = duracao;
	}
	public int getQuantEpisodios(){
		return quantEpisodios;
	}
	public void setQuantEpisodios(int quantEpisodios) {
		this.quantEpisodios = quantEpisodios;
	}
	public int getquantTemps(){
		return quantTemps;
	}
	public void setquantTemps(int quantTemps) {
		this.quantTemps = quantTemps;
	}
	
	@Override
	public void descricao() {
		super.descricao();
		System.out.println("Duração: "+ this.getDuracao());
		System.out.println("Qnt. de Episódios: "+this.getQuantEpisodios());
		System.out.println("Qnt. de Temporadas: "+this.getquantTemps());
	}
}
