package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESAtributoService {

	@RequestMapping(value = "/desatributoEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desatributoEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.atributo_editar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("atributo_id", Jpo.INTEGER);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("estado", Jpo.DECIMAL);
		pResult.input("usuario_modificacion_id", Jpo.DECIMAL);
		pResult.input("atributo_padre_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/desatributoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desatributoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.atributo_listar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("atributo_id", Jpo.INTEGER);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("estado", Jpo.DECIMAL);
		pResult.input("fecha_registro_min", Jpo.DATE);
		pResult.input("fecha_registro_max", Jpo.DATE);
		pResult.input("fecha_modificacion_min", Jpo.DATE);
		pResult.input("fecha_modificacion_max", Jpo.DATE);
		pResult.input("page", Jpo.INTEGER);
		pResult.input("size", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/desatributoObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desatributoObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.atributo_obtener","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("atributo_id", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/desatributoRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desatributoRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.atributo_registrar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("estado", Jpo.DECIMAL);
		pResult.input("usuario_registro_id", Jpo.DECIMAL);
		pResult.input("atributo_padre_id", Jpo.INTEGER);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}