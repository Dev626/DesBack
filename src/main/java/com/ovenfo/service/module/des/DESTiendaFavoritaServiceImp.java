package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESTiendaFavoritaServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESTiendaFavoritaServiceImp extends DESTiendaFavoritaService {

	@RequestMapping(value = "/destiendaFavoritaEliminar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaFavoritaEliminar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaFavoritaEliminar(ppo, request);
	}

	@RequestMapping(value = "/destiendaFavoritaRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaFavoritaRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destiendaFavoritaRegistrar(ppo, request);
	}

}