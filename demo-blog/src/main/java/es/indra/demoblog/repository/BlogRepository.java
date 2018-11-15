/**
 * 
 */
package es.indra.demoblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.indra.demoblog.model.Blog;

/**
 * @author daniel
 * 
 * Hereda de la clase JpaRepository
 * Esta interfaz necesita unos tipos de los que heredar.
 *
 */
@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
