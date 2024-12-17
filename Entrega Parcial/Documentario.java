//Nome: Carlos Eduardo Martins Ferreira RA: 2576163
public class Documentario extends Dvd{
	private String tema;
	private String narrador;

	public Documentario(){

	}

	public String getTema(){
		return tema;
	}
	public String getNarrador(){
		return narrador;
	}

	public void setTema(String tema){
		this.tema=tema;
	}
	public void setNarrador(String narrador){
		this.narrador=narrador;
	}
}