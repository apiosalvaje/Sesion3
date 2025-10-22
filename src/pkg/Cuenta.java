package pkg;

public class Cuenta {
	

	String numero;
	String titular;
	Double saldo;
	
	public Cuenta(Double i) {
		// TODO Auto-generated constructor stub
		saldo = i;
	}

	public Double ingresar(Double i) {
		// TODO Auto-generated method stub
		saldo = 200.0;
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double retirar(Double i) {
		// TODO Auto-generated method stub
		saldo = -200.0;
		return saldo;
	}
}
