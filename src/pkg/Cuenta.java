package pkg;

public class Cuenta {
	

	String numero;
	String titular;
	Double saldo;
	
	public Cuenta(double i) {
		// TODO Auto-generated constructor stub
		this.saldo = i;
	}

	public void ingresar(double i) {
		// TODO Auto-generated method stub
		saldo = 200.0;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void retirar(double i) {
		// TODO Auto-generated method stub
		saldo = -200.0;
	}
}
