/**
 * 
 */
package es.indra.apicarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.indra.apicarro.model.Producto;

/**
 * @author daniel
 *
 */
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
