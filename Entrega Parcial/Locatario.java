//Nome: Carlos Eduardo Martins Ferreira RA: 2576163
public class Locatario {
	private String nome; 
	private String cpf;
	private String telefone; 

    	public Locatario(){

    	}
	

	public String getNome(){
		return nome;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public String getTelefone(){
		return telefone;
	}



	public void setNome(String nome){
		this.nome = nome;
	}

	public void setCpf(String cpf) throws CpfException{
		if(cpf != null/* && cpf.length() == 11 Não sei se é considerado sistema de validação */){
			try{
				long cpfNumerico = Long.parseLong(cpf);
				if (cpfNumerico > 0){
					this.cpf = cpf;
				}
				else{
					throw new CpfException();	
				}
			}catch(NumberFormatException e){
				throw new CpfException();
			}
		}
		else{
			throw new CpfException();
		}
	}

	public void setTelefone(String telefone) throws TelefoneException{
		if(telefone != null){
			try{
				long TelNumerico = Long.parseLong(telefone);
				if (TelNumerico > 0){
					this.telefone = telefone;
				}
				else{
					throw new TelefoneException();	
				}
			}catch(NumberFormatException e){
				throw new TelefoneException();
			}
		}
		else{
			throw new TelefoneException();
		}
	}

}