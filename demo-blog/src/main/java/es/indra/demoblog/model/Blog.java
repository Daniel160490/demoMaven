/**
 * 
 */
package es.indra.demoblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author daniel
 *
 */
@Entity
public class Blog {

	@Id
	@GeneratedValue
	int id;
	String titulo;
	String contenido;
	
	
	public Blog() {
		
	}


	/**
	 * @param id
	 * @param titulo
	 * @param contenido
	 */
	public Blog(int id, String titulo, String contenido) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.contenido = contenido;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}


	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
}
