/**
 * 
 */
package es.indra.demoblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.indra.demoblog.service.BlogService;

/**
 * @author daniel
 *
 */
@Controller
public class BlogController {

	@Autowired
	BlogService blogServive;
}
