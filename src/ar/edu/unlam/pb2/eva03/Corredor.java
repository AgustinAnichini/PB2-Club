package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {

	private Integer DistanciaPreferida;
	private Integer CantidadDeKilometrosEntrenados;

	public Corredor(Integer numeroSocio, String nombre, Integer DistanciaPreferida) {
		super(numeroSocio, nombre);
		this.DistanciaPreferida = DistanciaPreferida;
		this.CantidadDeKilometrosEntrenados = 0;
	}

	public Integer getDistanciaPreferida() {
		return DistanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		DistanciaPreferida = distanciaPreferida;
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
