package banco.com.dados;

public abstract class Conta implements IConta{
		private static final double AGENCIA_PADRAO = 001d;
		protected static int sequencial = 1;
		protected int numero;
		protected Cliente titular;
		protected double saldo;
		protected double agencia;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = sequencial++;
		this.titular = cliente;
	}
		@Override
		public void depositar(double valor) {this.saldo = saldo + valor;}
		@Override
		public void sacar(double valor) {saldo -= valor;}

		@Override
		public void transferir(double valor, IConta contaDestino) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		public double getSaldo() {
			return this.saldo;
		}
		public double getAgencia() {
			return this.agencia;
		}
		public Cliente getTitular() {
			return this.titular;
		}
		public int getNumero(){ return this.numero;}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", getTitular()));
		System.out.println(String.format("Agencia: %d", getAgencia()));
		System.out.println(String.format("Numero: %d", getNumero()));
		System.out.println(String.format("Saldo: %.2f", getSaldo()));
	}

	@Override
	public String toString() {
		return "Conta{" +
				"numero=" + this.numero +
				", agencia=" + getAgencia() +
				", titular=" + getTitular() +
				", saldo=" + getSaldo() +
				'}';
	}
}

