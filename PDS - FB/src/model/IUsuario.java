/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import grafo.Vertex;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import model.rankings.RankingAmigos;

import tests.ParDeVerticesNaoExistenteException;
import tests.VerticeJaExisteException;

/**
 *
 * @author larissa
 */
public interface IUsuario {
	
    public String getAniversario();

	public String getID();

	public String getEmail();

	public String getNome();

	public String getBio();

	public String getSobre();

	public String getCidadeNatal();
	
	public String getUsername();

	public String getStatusRelacionamento();
      
    public List<IPagina> buscarPaginasCurtidas();

	public List<IUsuario> getAmigos();
	
	public List<String> getAmigosIDs();
	
	public List<String> getAmigosNomes();
	
	public RankingAmigos getRanking();
	
	public List<Vertex> buscarAmigos(String nome) throws FileNotFoundException, IOException, VerticeJaExisteException, ParDeVerticesNaoExistenteException;//ajeitar o nome

	public RankingAmigos buscarAmigosMaiorAfinidade() throws FileNotFoundException, IOException, VerticeJaExisteException, ParDeVerticesNaoExistenteException;

	public List<IPagina> recomendarPaginas() throws IOException, VerticeJaExisteException, ParDeVerticesNaoExistenteException;

	public List<Vertex> sugerirAmigos(String nome) throws FileNotFoundException, IOException, VerticeJaExisteException, ParDeVerticesNaoExistenteException;
	
	
}