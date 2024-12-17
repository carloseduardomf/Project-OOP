//Nome: Carlos Eduardo Martins Ferreira RA: 2576163
public class Locacao{
	private Locatario locatario;
	private Dvd dvd;
	private String dataLocacao;
	private boolean locacaoAtiva;
	private String dataDevolucao;
	
	public Locacao(Locatario locatario, Dvd dvd, String dataLocacao){
		setLocatario(locatario); 
		setDvd(dvd);            
		setDataLocacao(dataLocacao); 
		setLocacaoAtiva(true);
	}

	public Locatario getLocatario(){
		return locatario;
	}

	public Dvd getDvd(){
		return dvd;
	}

	public String getDataLocacao(){
		return dataLocacao;
	}

	public String getDataDevolucao(){
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao){
		this.dataDevolucao = dataDevolucao;
	}

	public boolean getLocacaoAtiva(){
		return locacaoAtiva;
	}

	public String getResumo() {
		return "Locatário: " + locatario.getNome() + ", DVD: " + dvd.getTitulo() + ", Data de Locação: " + dataLocacao;
    }

	public void finalizarLocacao(){
		this.locacaoAtiva = false;
	}

    public void setDvd(Dvd dvd) {
        this.dvd = dvd;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

	public void setLocacaoAtiva(boolean locacaoAtiva) {
		this.locacaoAtiva = locacaoAtiva;
	}
}