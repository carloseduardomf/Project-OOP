//Nome: Carlos Eduardo Martins Ferreira RA: 2576163
import java.util.ArrayList;
import java.util.List;

public class Locacoes{
	private List<Locacao> locacoes;
	
	public Locacoes(){
		locacoes = new ArrayList<>();
	}
	public void adicionarLocacao(Locatario locatario, Dvd dvd, String dataLocacao) {
		if(dvd.getDisponivel()){
			Locacao locacao = new Locacao(locatario, dvd, dataLocacao);
			locacoes.add(locacao);
			dvd.setDisponivel(false);
			System.out.println("Locação realizada com sucesso!\n");
		}else{
			System.out.println("DVD indisponivel para locacao.\n");
		}
	}

	public void finalizarLocacao(int codigoDvd) {
		for (Locacao locacao : locacoes) {
			if (locacao.getDvd().getCodigo() == codigoDvd) {
				locacao.getDvd().setDisponivel(true);
				System.out.println("Locação finalizada com sucesso!");
			}
		}
		System.out.println("Locação não encontrada ou já finalizada.");
	}
	
}


