/**
 * 
 */
package net.impactotecnologico.mvc.demo.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.impactotecnologico.mvc.demo.model.Categoria;

/**
 * @author daniel
 *
 */
@Controller
public class CategoryController {

	@RequestMapping(path = { "/categoria" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String sayHello(Model model) throws JSONException {

		Categoria cat = new Categoria(1, "Categoria de blog 1");

		model.addAttribute("id", cat.getId());
		model.addAttribute("nombre", cat);

		JSONObject json = new JSONObject();

		json.put("id", cat.getId());
		json.put("nombre", cat.getNombre());

		return json.toString();
	}
}
