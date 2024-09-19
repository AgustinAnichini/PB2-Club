package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<>();
		this.competencias = new TreeMap<>();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public void agregarDeportista(Deportista nuevoDeportista) {
		if (validarDeportista(nuevoDeportista)) {
			socios.add(nuevoDeportista);
		}

	}

	private Boolean validarDeportista(Deportista nuevoDeportista) {
		Boolean sePuedeAgregar = false;
		if (!(socios.contains(nuevoDeportista))) {
			sePuedeAgregar = true;
		}
//		throw new DeportistaExistenteExeption();
		return sePuedeAgregar;
	}

	public Integer getCantidadSocios() {
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento carreraNatacionEnAguasAbiertas, String nombre) {
		Evento nuevoEvento = new Evento(carreraNatacionEnAguasAbiertas);

		this.competencias.put(nombre, nuevoEvento);

	}

	public Integer inscribirEnEvento(String nombreEvento, Deportista nuevoDeportista) throws NoEstaPreparado {
		Evento buscado = this.competencias.get(nombreEvento);
		Integer numeroDeInscripcion = buscado.inscribirAEvento(nuevoDeportista);
		
		return numeroDeInscripcion;
	}

}
