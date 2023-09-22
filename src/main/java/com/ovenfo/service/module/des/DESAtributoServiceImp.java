package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESAtributoServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESAtributoServiceImp extends DESAtributoService {

	@RequestMapping(value = "/desatributoEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desatributoEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desatributoEditar(ppo, request);
	}

	@RequestMapping(value = "/desatributoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desatributoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desatributoListar(ppo, request);
	}

	@RequestMapping(value = "/desatributoObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desatributoObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desatributoObtener(ppo, request);
	}

	@RequestMapping(value = "/desatributoRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desatributoRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desatributoRegistrar(ppo, request);
	}

}