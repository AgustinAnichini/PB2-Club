package ar.edu.unlam.pb2.eva03;

public class DeportistaExistenteExeption extends Exception {

	public DeportistaExistenteExeption() {
		super("Deportista existente, No fue posible agregarlo");
	}
}
