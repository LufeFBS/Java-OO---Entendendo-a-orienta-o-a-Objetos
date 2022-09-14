
public class TestaMetodo {
			public static void main(String[] args) {
				Conta contaDoLuiz = new Conta();
				contaDoLuiz.saldo = 100;
				// contaDoLuiz.deposita(100);
				// System.out.println(contaDoLuiz.saldo);				
				
				Conta contaDoLucas = new Conta();
				// contaDoLucas.deposita(500);
				
				// contaDoLucas.transfere(300, contaDoLuiz);
				// System.out.println(contaDoLuiz.saldo);
				
				contaDoLuiz.titular = "Luiz Fernando";
				System.out.println(contaDoLuiz.titular);
			}
		
			
			
}
