package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESComercianteServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESComercianteServiceImp extends DESComercianteService {

	@RequestMapping(value = "/destiendaComercianteObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaComercianteObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaComercianteObtener(ppo, request);
	}

	@RequestMapping(value = "/destiendaComerciantePedidoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaComerciantePedidoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaComerciantePedidoListar(ppo, request);
	}

}