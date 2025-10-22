package pkg;

import java.util.List;
import java.util.ArrayList;

public class Cuenta {
	

	String numero;
	String titular;
	Double saldo;
	List <Movimiento> movimientos;
	
	public Cuenta(double i, String n) {
		saldo = i;
		numero = n;
		titular = "Propietario";
		movimientos = new ArrayList<>();
	}

	public void ingresar(double i) {
		saldo += i;
		Signo S = Signo.H;
		Movimiento m = new Movimiento(S, "Ingreasados " + i + " € en la cuenta " + numero, i);
		movimientos.add(m);
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void retirar(double i) {
		if (saldo-i >= -500) {
			saldo -= i;
			Signo S = Signo.D;
			Movimiento m = new Movimiento(S, "Retirados " + i + " € en la cuenta " + numero, i);
			movimientos.add(m);
		}
		else {
			System.out.println("Fondos insuficientes (saldo " + saldo + "€) en la cuenta 67890 para el reintegro de " + i + "€");
		}
	}
}
