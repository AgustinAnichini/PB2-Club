package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;

	public Evento(TipoDeEvento tipo) {
		this.tipo = tipo;
		this.numeroDeInscripcion = 0;
		this.participantes = new TreeMap<>();
	}

	public Integer inscribirAEvento(Deportista nuevoDeportista) throws NoEstaPreparado {
		// validar que este deportista sea un deportista capacitado para esa competencia

		if (estaPreparado(nuevoDeportista)) {
			this.participantes.put(numeroDeInscripcion, nuevoDeportista);
			this.numeroDeInscripcion++;
		}

		return numeroDeInscripcion;
	}

	private Boolean estaPreparado(Deportista nuevoDeportista) throws NoEstaPreparado {
		Boolean estaPreparado = false;

		switch (this.tipo) {
		case CARRERA_5K:
			estaPreparado = preparadoParaCarreras(nuevoDeportista);
			break;
		case CARRERA_10K:
			estaPreparado = preparadoParaCarreras(nuevoDeportista);
			break;
		case CARRERA_21K:
			estaPreparado = preparadoParaCarreras(nuevoDeportista);
			break;
		case CARRERA_42K:
			estaPreparado = preparadoParaCarreras(nuevoDeportista);
			break;
		case DUATLON:
			estaPreparado = estaPreparadoParaDuatlon(nuevoDeportista);
			break;
		case CARRERA_NATACION_EN_PICINA:
			estaPreparado = estaPreparadoParaNadar(nuevoDeportista);
			break;
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			estaPreparado = estaPreparadoParaNadar(nuevoDeportista);
			break;
		case TRIATLON_SHORT:
			estaPreparado = estaPreparadoParaTriatlon(nuevoDeportista);
			break;
		case TRIATLON_OLIMPICO:
			estaPreparado = estaPreparadoParaTriatlon(nuevoDeportista);
			break;
		case TRIATLON_MEDIO:
			estaPreparado = estaPreparadoParaTriatlon(nuevoDeportista);
			break;
		case TRIATLON_IRONMAN:
			estaPreparado = estaPreparadoParaTriatlon(nuevoDeportista);
			break;

		}
		return estaPreparado;
	}

	private Boolean estaPreparadoParaTriatlon(Deportista nuevoDeportista) throws NoEstaPreparado {
		Boolean estaPreparado;
		if (!(nuevoDeportista instanceof ICorredor) || !(nuevoDeportista instanceof ICiclista)
				|| !(nuevoDeportista instanceof INadador)) {
			throw new NoEstaPreparado();
		}
		estaPreparado = true;
		return estaPreparado;
	}

	private Boolean estaPreparadoParaNadar(Deportista nuevoDeportista) throws NoEstaPreparado {
		Boolean estaPreparado;
		if (!(nuevoDeportista instanceof INadador)) {
			throw new NoEstaPreparado();
		}
		estaPreparado = true;
		return estaPreparado;
	}

	private Boolean estaPreparadoParaDuatlon(Deportista nuevoDeportista) throws NoEstaPreparado {
		Boolean estaPreparado;
		if (!(nuevoDeportista instanceof ICorredor) || !(nuevoDeportista instanceof ICiclista)) {
			throw new NoEstaPreparado();
		}
		estaPreparado = true;
		return estaPreparado;
	}

	private Boolean preparadoParaCarreras(Deportista nuevoDeportista) throws NoEstaPreparado {
		Boolean estaPreparado;
		if (!(nuevoDeportista instanceof ICorredor)) {
			throw new NoEstaPreparado();
		}
		estaPreparado = true;
		return estaPreparado;
	}
}
