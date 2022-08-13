import banco.com.dados.*;
public class Main {
	public static void main(String[] args) {
		// crie uma cliente
		Cliente client = new Cliente("Erika Maria Nascimento da Silva");
		Endereco address = new Endereco(6582, "Boa Vista Roraima");
		client.setAddress(address); // recebe um objeto
		// crie uma conta para o cliente
		Conta saving = new Poupanca(client); // recebe um objeto
		Conta chain = new Corrente(client);
		//exibir no console os dados do cliente
		System.out.println(client);
		// modificar o nome do cliente
		client.setNome("Joana Dark");
		//
		System.out.println(saving);
		//depositar
		saving.depositar(100);

	}
}
