/**
 * 
 */
package es.indra.apicarro.service;

import java.util.List;

import es.indra.apicarro.model.Categoria;

/**
 * @author daniel
 *
 */
public interface CategoriaService {

	public List<Categoria> getAllCategoria();

	public Categoria getCategoriaById(int id);

	public Categoria updateBlog(Categoria categoria);

	public Categoria saveCategoria(Categoria categoria);

	public void removeCategoria(Categoria categoria);
}
