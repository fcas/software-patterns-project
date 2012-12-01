package grafo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import model.IUsuario;
import model.UsuarioApi;


import tests.ParDeVerticesNaoExistenteException;
import tests.VerticeJaExisteException;

public class Teste {

	private static GerarGrafo gerarGrafo;
	@SuppressWarnings("unused")
	private static IUsuario usuarioFelipe;

	public static void main(String[] args) throws FileNotFoundException,
			IOException, VerticeJaExisteException,
			ParDeVerticesNaoExistenteException {
		
		usuarioFelipe = new UsuarioApi("felipecordeiroalves");
		gerarGrafo = new GerarGrafo(); 

		@SuppressWarnings("static-access")
		AbstractGraph graph = gerarGrafo.getInstance();

		List<Vertex> list = graph.sugerirAmigos("Dalay Almeida");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}

	}

}