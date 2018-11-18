/**
 * 
 */
package es.indra.apicarro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.indra.apicarro.aspects.anotaciones.MedidorDeTiempo;
import es.indra.apicarro.model.Categoria;
import es.indra.apicarro.model.Producto;
import es.indra.apicarro.repository.ProductoRepository;
import es.indra.apicarro.service.ProductoService;

/**
 * @author daniel
 *
 */
@Component
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoRepository productoRepository;

	@Override
	@MedidorDeTiempo
	public List<Producto> getAllProducto() {

		return this.productoRepository.findAll();
	}

	@Override
	public Producto getProductoById(int id) {
		/*
		 * Optional se usa por si lo que se esta buscando no está
		 */
		Optional<Producto> cate = this.productoRepository.findById(id);
		if (cate.isPresent()) {
			return cate.get();

		}
		return null;
	}

	@Override
	public Producto updateProducto(Producto producto) {

		if (this.getProductoById(producto.getId()) != null) {
			return this.productoRepository.save(producto);
		}

		return null;
	}

	@Override
	public Producto saveProducto(Producto producto) {

		return this.productoRepository.save(producto);
	}

	@Override
	public void removeProducto(Producto producto) {
		this.productoRepository.delete(producto);
	}

	@Override
	public List<Producto> getAllProductoCat(Categoria c) {

		List<Producto> listaCat;

		productoRepository.findAll();
		return null;

	}
}
