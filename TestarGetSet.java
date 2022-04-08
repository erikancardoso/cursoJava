package banco;

public class TestarGetSet {
	public static void main(String[] args) {
		DadosDaConta conta = new DadosDaConta(7890,5678);
		//System.out.println(conta.getNumero());
		
		DadosDosClientes cliente = new DadosDosClientes();
		cliente.setNome("Erika Cardoso");
		//System.out.println(cliente.getNome());
		
		conta.setTitular(cliente);
		//System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programadora");
		System.out.println(conta.getTitular().getProfissao() +"\n"+ conta.getTitular().getNome());
		
		DadosDosClientes titularDaConta  = conta.getTitular();
		
		System.out.println(conta.getTitular());
		System.out.println(cliente);
		System.out.println(titularDaConta);
	}
}
