package banco;

public class DadosDaConta {
 
		private int numero;
		private int agencia;
		private DadosDosClientes titular;
		private double saldo;
		private static int total; // verifica a classe, pertence a classe  e não serao instanciados a objetos.
		
		//construtor () de novos objetos rotina de inicialização
		public DadosDaConta(int agencia, int numero){
			DadosDaConta.total++; // pertence a classe 
			//System.out.println("O total de contas criadas: "+ total);
			this.agencia = agencia;
			this.numero = numero;
			//System.out.println("Construindo a conta bancaria "+ this.numero + " Agência "+this.agencia);
			// um objeto ja nasce em estado inconsistente, para banco é necessario que não receba nenhum valor mas altomaticamente os atributos já recebem 0
			//aqui devemos restringir dados de acordo com a regra de negocio.
		}
		
		void deposita(double valor) {
			this.saldo = saldo + valor; 
			
		}
		public boolean saca(double valor) { 
			if (this.saldo >= valor) {
				this.saldo = this.saldo - valor;
				return true;
			} else {
				return false;
			} 
			
		}
		public boolean transfere(double valor, DadosDaConta destino) { 
			
			if (this.saldo >= valor) {
				this.saldo -= valor;
				destino.deposita(valor);
				return true;
			} else {
				return false;
			}
		}
		
		public double getSaldo() {
			return this.saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public int getNumero() {
			return this.numero;
		}
		public void setNumero(int numero) {
			if(numero <= 0) {
				System.out.println("Não é possível criar numero da conta com valores negativos");
				return;
			}
			this.numero = numero;
		}
		public int getAgencia() {
			return this.agencia;
		}
		public void setAgencia(int agencia) {
			if(agencia <= 0) {
				System.out.println("Não é possivel criar agencia com valores negativos");
				return;
			}
			this.agencia = agencia;
		}
		public DadosDosClientes getTitular() {
			return this.titular;
		}
		public void setTitular(DadosDosClientes titular) {
			this.titular = titular;
		}
		public static int getTotal() {
			return DadosDaConta.total;
			//metodos static acessam apenas atributos static da propria classe.
		}
}

