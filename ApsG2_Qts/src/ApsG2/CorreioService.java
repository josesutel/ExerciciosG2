package ApsG2;

public class CorreioService {
	private String cep;
	public String buscaEndereco(String cep) {
		if(cep == "9000000") {
			cep = "Portoalegre";
		}if(cep =="8000000") {
			cep= "assis brasil";
		}
		return cep;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
