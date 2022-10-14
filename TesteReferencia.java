
public class TesteReferencia {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("salda da primeira conta "
				+ primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda conta " + segundaConta.saldo);
		
		segundaConta.saldo +=100;
		System.out.println("salda da segunda conta e " + segundaConta.saldo);
		
	}

}
