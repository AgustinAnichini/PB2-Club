package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador {

	private String distanciaPreferida;
	private TipoDeBicicleta tipoDeBici;
	private Integer CantidadDeKilometrosEntrenados;

	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipoDeBici) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.tipoDeBici = tipoDeBici;
		this.CantidadDeKilometrosEntrenados = 0;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBici;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBici) {
		this.tipoDeBici = tipoDeBici;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer kmEntrenados) {
		this.CantidadDeKilometrosEntrenados = kmEntrenados;

	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.CantidadDeKilometrosEntrenados;
	}

}
