package banco;

public class TestaValor {
	public static void main(String[] args) {
		DadosDaConta contaUm = new DadosDaConta(4567,6789); // informar a agencia e o numero da conta em parametro 
		
		DadosDaConta contaDois =new DadosDaConta (4567,7654);
		
		DadosDaConta contaTres = new DadosDaConta (7867,9987);
		
		System.out.println(DadosDaConta.getTotal());
		System.out.println(contaUm.getAgencia()+contaDois.getAgencia()+contaTres.getAgencia());
	}
}