package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESTiendaFavoritaService {

	@RequestMapping(value = "/destiendaFavoritaEliminar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaFavoritaEliminar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_favorita_eliminar","DES");
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaFavoritaRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaFavoritaRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_favorita_registrar","DES");
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaFavoritaListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaFavoritaListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_favorita_listar","DES");
		pResult.input("usuario_id", Jpo.DECIMAL);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaFavoritaObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaFavoritaObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_favorita_obtener","DES");
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("tienda_id", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}