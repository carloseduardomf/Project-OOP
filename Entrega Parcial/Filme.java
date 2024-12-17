//Nome: Carlos Eduardo Martins Ferreira RA: 2576163
public class Filme extends Dvd{
	private int duracao;
	private int imdb;

	public Filme(){

	}

	

	public int getDuracao(){
		return duracao;
	}
	public int getImdb(){
		return imdb;
	}

	public void setDuracao(int duracao){
		this.duracao=duracao;
	}
	public void setImdb(int imdb){
		this.imdb=imdb;
	}
}