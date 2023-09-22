package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESCategoriaServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESCategoriaServiceImp extends DESCategoriaService {

	@RequestMapping(value = "/descategoriaRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.descategoriaRegistrar(ppo, request);
	}

	@RequestMapping(value = "/descategoriaObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.descategoriaObtener(ppo, request);
	}

	@RequestMapping(value = "/descategoriaListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object descategoriaListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.descategoriaListar(ppo, request);
	}

	@RequestMapping(value = "/descategoriaEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.descategoriaEditar(ppo, request);
	}

}