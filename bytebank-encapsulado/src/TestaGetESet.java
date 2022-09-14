
public class TestaGetESet {

			public static void main(String[] args) {
					Conta conta = new Conta(5, 1137);
					//conta.numero = 1337;
					// conta.setNumero(1137);
					// conta.setAgencia(5);
					
					// System.out.println(conta.getNumero());
					// System.out.println(conta.getAgencia());
					
					Cliente ronaldinho = new Cliente();
							//conta.titular = paulo;
					ronaldinho.setNome("ronaldinho");
					ronaldinho.setCpf("222.222.222-22");
					
						conta.setTitular(ronaldinho);
						
						System.out.println(conta.getTitular().getCpf());
						
						conta.getTitular().setProfissao("programador");
					
			}
}
