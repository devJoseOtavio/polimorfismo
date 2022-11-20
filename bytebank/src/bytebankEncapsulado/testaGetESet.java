package bytebankEncapsulado;

public class testaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		cliente paulo = new cliente();
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
	}
}
