package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESCategoriaProductoService {

	@RequestMapping(value = "/descategoriaProductoComboListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaProductoComboListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_producto_combo_listar","DES");
		pResult.input("categoria_id", Jpo.INTEGER);
		pResult.input("nombre_sku", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/descategoriaProductoAdjuntoEliminar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaProductoAdjuntoEliminar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_producto_adjunto_eliminar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("categoria_producto_id", Jpo.DECIMAL);
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("adjunto_id", Jpo.DECIMAL);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/descategoriaProductoEliminar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaProductoEliminar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_producto_eliminar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("categoria_producto_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/descategoriaProductoRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaProductoRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_producto_registrar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("categoria_id", Jpo.INTEGER);
		pResult.input("adjuntos", Jpo.STRING);
		pResult.input("sku", Jpo.STRING);
		pResult.input("sku_producto", Jpo.STRING);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("descripcion", Jpo.STRING);
		pResult.input("estado", Jpo.DECIMAL);
		pResult.input("usuario_registro_id", Jpo.DECIMAL);
		pResult.input("categoria_producto_atributo", Jpo.STRING);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/descategoriaProductoObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaProductoObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_producto_obtener","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("categoria_producto_id", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/descategoriaProductoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaProductoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_producto_listar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("categoria_producto_id", Jpo.INTEGER);
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

	@RequestMapping(value = "/descategoriaProductoEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object descategoriaProductoEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.categoria_producto_editar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("categoria_producto_id", Jpo.INTEGER);
		pResult.input("sku", Jpo.STRING);
		pResult.input("sku_producto", Jpo.STRING);
		pResult.input("adjuntos", Jpo.STRING);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("descripcion", Jpo.STRING);
		pResult.input("estado", Jpo.DECIMAL);
		pResult.input("usuario_modificacion_id", Jpo.DECIMAL);
		pResult.input("categoria_producto_atributo", Jpo.STRING);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}