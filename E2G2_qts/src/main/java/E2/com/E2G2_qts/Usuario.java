package E2.com.E2G2_qts;

public class Usuario {
	private int id;
	private String nome;
	private long cpf;
	private long telefone;
	
	
	public boolean TamanhoNome(String nome) {
		if(nome == " " ) {
		System.out.println("Nome não pode ficar em branco");	
		}
		return false;
	} public boolean TamanhoCpf() {
		if(cpf > 12 && cpf < 10) {
			System.out.println("Preencha correto o Cpf");
		}else {
			
		}
		
		return true;
		
	}
	public boolean TestaNumFone(long telefone) {
		if(telefone > 9 && telefone < 8) {
			System.out.println("Preencha correto o numero do telefone");
		}else {
		}
		
		
		return true;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public long setCpf(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
