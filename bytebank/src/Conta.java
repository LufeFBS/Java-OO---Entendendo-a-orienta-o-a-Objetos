public class Conta {
	
	// Temos 4 atributos
	
			double saldo;
			int agencia;
			int numero;
			String titular;
			
	
	// Metodos é parecido com uma função
	
		public void deposita(double valor) {
				this.saldo = this.saldo + valor;
	}
		
		public boolean saca(double valor) {
				if (this.saldo >= valor) {
					this.saldo = this.saldo - valor;
					System.out.println("O saque foi um sucesso!!!");
					return true;
				} else {
					System.out.println("Saldo insuficiente");
					return false;
				}
		}
		
		public boolean transfere(double valor, Conta destino)  {
			if(this.saldo >= valor) {
					this.saldo -= valor;
					destino.deposita(valor);
					System.out.println("Trasnferencia realizada.");
					return true;
			} 
		return false;	
		}
			}
