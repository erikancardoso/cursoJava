package banco;

public class Endereco {
	private int cep;
	private int numeroResidencia;
	private String nomeRua;
	private String bairro;
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getNumeroResidencia() {
		return this.numeroResidencia;
	}
	public void setNumeroResidencia(int numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
	}
	public String getNomeRua() {
		return this.nomeRua;
	}
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	public String getBairro() {
		return this.bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}
