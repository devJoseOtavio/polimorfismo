package bytebankEncapsulado;

public class Conta {
    private double saldo = 100;
    private int agencia;
    private int numero;
    private cliente titular;

   public void deposita(double valor){

        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor){

        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor){
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
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int numero) {
    	this.numero = numero;
    }
    
    public int getAgencia() {
    	return this.agencia;
    }
    
    public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
    
    public void setTitular(cliente titular) {
		this.titular = titular;
	}
    
    public cliente getTitular() {
		return titular;
	}
}
