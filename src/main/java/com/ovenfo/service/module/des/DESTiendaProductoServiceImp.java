package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESTiendaProductoServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)

public class DESTiendaProductoServiceImp extends DESTiendaProductoService {

	@RequestMapping(value = "/destiendaProductoEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaProductoEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaProductoEditar(ppo, request);
	}

	@RequestMapping(value = "/destiendaProductoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaProductoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaProductoListar(ppo, request);
	}

	@RequestMapping(value = "/destiendaProductoObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaProductoObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaProductoObtener(ppo, request);
	}

	@RequestMapping(value = "/destiendaProductoRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaProductoRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaProductoRegistrar(ppo, request);
	}

}