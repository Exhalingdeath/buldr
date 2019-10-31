package no.eiliv.bulder.rest.genericresources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class AbstractResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getAll() {
		return "all";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String getById(@PathVariable("id") Long id) {
		return "one: "+id;
	}
	
	
	
}
