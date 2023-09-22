package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESTiendaServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESTiendaServiceImp extends DESTiendaService {

	@RequestMapping(value = "/destiendaEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaEditar(ppo, request);
	}

	@RequestMapping(value = "/destiendaListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaListar(ppo, request);
	}

	@RequestMapping(value = "/destiendaObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaObtener(ppo, request);
	}

	@RequestMapping(value = "/destiendaRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaRegistrar(ppo, request);
	}
	
	@RequestMapping(value = "/destiendaClienteObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object destiendaClienteObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaClienteObtener(ppo, request);
	}

}