
public class TestaValores {

		public static void main(String[] args) {
			
			Conta conta = new Conta(1337, 24226);
			
			// conta está inconsistente
			// conta.setAgencia(-50);
			// conta.setNumero(-330);
			
			Conta conta2 = new Conta(1337, 16549);
			Conta conta3 = new Conta(1335, 12549);
			
			System.out.println("Total de Contas criadas: "+ Conta.getTotal());
			
		}
}
