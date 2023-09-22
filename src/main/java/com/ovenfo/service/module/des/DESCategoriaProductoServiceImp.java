package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESCategoriaProductoServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESCategoriaProductoServiceImp extends DESCategoriaProductoService {

	@RequestMapping(value = "/descategoriaProductoRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaProductoRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.descategoriaProductoRegistrar(ppo, request);
	}

	@RequestMapping(value = "/descategoriaProductoObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaProductoObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.descategoriaProductoObtener(ppo, request);
	}

	@RequestMapping(value = "/descategoriaProductoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaProductoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.descategoriaProductoListar(ppo, request);
	}

	@RequestMapping(value = "/descategoriaProductoEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaProductoEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.descategoriaProductoEditar(ppo, request);
	}

}