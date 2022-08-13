package banco.com.dados;

public class Endereco {
	private int cepLocal;
	private String cidadeLocal;

	public Endereco(int cep, String cidade){ setCep(cep); setCidade(cidade);}
	public int getCep() {
		return cepLocal;
	}
	public void setCep(int cep) {
		this.cepLocal = cep;
	}
	public String getCidade(){ return cidadeLocal;}
	public void setCidade(String cidade){ this.cidadeLocal = cidade;}

	@Override
	public String toString() {
		return "Endereco{" +
				"cep=" + getCep() +
				", cidade='" + getCidade() + '\'' +
				'}';
	}
}
