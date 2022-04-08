package banco;

public class DadosDosClientes {
	private String nome;
	private String cpf;
	private Endereco endereco;
	private String profissao;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return this.profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
