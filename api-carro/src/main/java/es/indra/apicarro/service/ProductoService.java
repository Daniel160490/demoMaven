/**
 * 
 */
package es.indra.apicarro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.indra.apicarro.model.Categoria;
import es.indra.apicarro.model.Producto;

/**
 * @author daniel
 *
 */
@Service
public interface ProductoService {

	Producto getProductoById(int id);

	List<Producto> getAllProducto();

	Producto updateProducto(Producto producto);

	Producto saveProducto(Producto producto);

	List<Producto> getAllProductoCat(Categoria c);

	void removeProducto(Producto producto);

}
