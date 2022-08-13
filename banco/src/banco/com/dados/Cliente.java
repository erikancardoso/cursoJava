package banco.com.dados;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	private String name;
	private Endereco address;

	public Cliente(String nome) {setNome(nome);}

	public String getNome() {
		return this.name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}

	public Endereco getAddress (){return this.address;}
	public void setAddress (Endereco endereco){ this.address = endereco;}
	@Override
	public String toString() {
		return "{" +
				"nome='" + getNome() + '\'' +
				", endereco=" + getAddress() +
				'}';
	}
}
