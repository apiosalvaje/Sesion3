package pkg;

public class Movimiento {
	
	Signo signo;
	String detalle;
	Double importe;
	
	public Movimiento(Signo s, String d, Double i) {
		signo = s;
		detalle = d;
		importe = i;
	}
	
	public String getDetalle() {
		return detalle;
	}
	
	public Double getImporte() {
		return importe;
	}
	
	public Signo getSigno() {
		return signo;
	}
	
	public void setDetalle(String d) {
		detalle = d;
	}
	
	public void setImporte(Double i) {
		importe = i;
	}
	
	public void setSigno(Signo s) {
		signo = s;
	}
}
