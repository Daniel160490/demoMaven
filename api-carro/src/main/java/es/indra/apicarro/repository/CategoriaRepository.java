/**
 * 
 */
package es.indra.apicarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.indra.apicarro.model.Categoria;

/**
 * @author daniel
 *
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
