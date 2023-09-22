package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESCategoriaService {

	@RequestMapping(value = "/descategoriaRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_registrar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("icono", Jpo.STRING);
		pResult.input("estado", Jpo.DECIMAL);
		pResult.input("indicador_producto", Jpo.CHARACTER);
		pResult.input("usuario_registro_id", Jpo.DECIMAL);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/descategoriaObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_obtener","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("categoria_id", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/descategoriaListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_listar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("categoria_id", Jpo.INTEGER);
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

	@RequestMapping(value = "/descategoriaEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_editar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("categoria_id", Jpo.INTEGER);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("estado", Jpo.DECIMAL);
		pResult.input("indicador_producto", Jpo.CHARACTER);
		pResult.input("usuario_modificacion_id", Jpo.DECIMAL);
		pResult.input("icono", Jpo.STRING);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/descategoriaListarDisponibles", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaListarDisponibles(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_listar_disponibles","DES");
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}