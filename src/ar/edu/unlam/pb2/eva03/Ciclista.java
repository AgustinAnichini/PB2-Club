package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista {

	private String tipoDeBicicleta;

	public Ciclista(Integer numeroDeSocio, String nombre, String tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	public Object getTipoDeBicicleta() {
		return this.tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(String tipoDeBicicleta) {
		tipoDeBicicleta.toUpperCase();
		if (tipoDeBicicleta.equals(TipoDeBicicleta.values())) {
			this.tipoDeBicicleta = tipoDeBicicleta;
		}

	}

}
