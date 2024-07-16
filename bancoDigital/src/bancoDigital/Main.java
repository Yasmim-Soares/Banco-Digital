package bancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente Yasmim = new Cliente();
		Yasmim.setNome("Yasmim");
		
		Conta cc = new ContaCorrente(Yasmim);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(Yasmim);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
