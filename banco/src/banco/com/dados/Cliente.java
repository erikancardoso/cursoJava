package banco.com.dados;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	private String name;
	private Set<Endereco> address = new HashSet<>();

	public Cliente(String nome, Set<Endereco> endereco) {setNome(nome);
		setEndereco(endereco);
	}

	public String getNome() {
		return this.name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}

	public Set<Endereco> getEndereco() {
		return address;
	}
	public void setEndereco(Set<Endereco> endereco) {
		this.address = endereco;
	}
	@Override
	public String toString() {
		return "Cliente{" +
				"nome='" + getNome() + '\'' +
				", endereco=" + getEndereco() +
				'}';
	}
}
