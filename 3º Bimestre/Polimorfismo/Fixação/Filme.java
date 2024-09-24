public class Filme extends Conteudo{
	public int duracao;
	
	public Filme () {
	}
	public Filme (String t, int d) {
		super("Filme", t);
		this.duracao = d;
	}
	
	public int getDuracao(){
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	@Override
	public void descricao(){
		super.descricao();
		System.out.println("Duração: "+ this.getDuracao());
	}
}
