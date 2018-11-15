/**
 * 
 */
package es.indra.apicarro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.indra.apicarro.model.Categoria;
import es.indra.apicarro.repository.CategoriaRepository;
import es.indra.apicarro.service.CategoriaService;

/**
 * @author daniel
 *
 */
@Component
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> getAllCategoria() {

		return null;
	}

	@Override
	public Categoria getCategoriaById(int id) {
		/*
		 * Optional se usa por si lo que se esta buscando no está
		 */
		Optional<Categoria> cate = this.categoriaRepository.findById(id);
		if (cate.isPresent()) {
			return cate.get();

		}
		return null;
	}

	@Override
	public Categoria updateBlog(Categoria categoria) {

		if (this.getCategoriaById(categoria.getId()) != null) {
			return this.categoriaRepository.save(categoria);
		}

		return null;
	}

	@Override
	public Categoria saveCategoria(Categoria categoria) {

		return this.categoriaRepository.save(categoria);
	}

	@Override
	public void removeCategoria(Categoria categoria) {
		this.categoriaRepository.delete(categoria);
	}
}
