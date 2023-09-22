package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESTiendaProductoService {

	@RequestMapping(value = "/destiendaProductoRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaProductoRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_producto_registrar","DES");
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("categoria_producto_id", Jpo.INTEGER);
		pResult.input("descripcion", Jpo.STRING);
		pResult.input("precio", Jpo.DECIMAL);
		pResult.input("usuario_registro_id", Jpo.DECIMAL);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("indicador_stock", Jpo.CHARACTER);
		pResult.input("sku", Jpo.STRING);
		pResult.input("fecha_vencimiento", Jpo.DATE);
		pResult.input("store_subcategory_id", Jpo.INTEGER);
		pResult.input("short_desc", Jpo.STRING);
		pResult.input("addtional_info", Jpo.STRING);
		pResult.input("shipp_returns", Jpo.STRING);
		pResult.input("sale_price", Jpo.DECIMAL);
		pResult.input("stock", Jpo.INTEGER);
		pResult.input("fotos", Jpo.STRING);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaProductoEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaProductoEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_producto_editar","DES");
		pResult.input("tienda_producto_id", Jpo.DECIMAL);
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("categoria_producto_id", Jpo.INTEGER);
		pResult.input("descripcion", Jpo.STRING);
		pResult.input("precio", Jpo.DECIMAL);
		pResult.input("usuario_modificacion_id", Jpo.DECIMAL);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("indicador_stock", Jpo.CHARACTER);
		pResult.input("sku", Jpo.STRING);
		pResult.input("fecha_vencimiento", Jpo.DATE);
		pResult.input("store_subcategory_id", Jpo.INTEGER);
		pResult.input("short_desc", Jpo.STRING);
		pResult.input("addtional_info", Jpo.STRING);
		pResult.input("shipp_returns", Jpo.STRING);
		pResult.input("sale_price", Jpo.DECIMAL);
		pResult.input("stock", Jpo.INTEGER);
		pResult.input("fotos", Jpo.STRING);
		pResult.input("ref_store_product_variant", Jpo.STRING);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaProductoObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaProductoObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_producto_obtener","DES");
		pResult.input("tienda_producto_id", Jpo.DECIMAL);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaProductoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaProductoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_producto_listar","DES");
		pResult.input("tienda_producto_id", Jpo.DECIMAL);
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("categoria_producto_id", Jpo.INTEGER);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("descripcion", Jpo.STRING);
		pResult.input("precio_min", Jpo.DECIMAL);
		pResult.input("precio_max", Jpo.DECIMAL);
		pResult.input("estado", Jpo.DECIMAL);
		pResult.input("fecha_registro_min", Jpo.DATE);
		pResult.input("fecha_registro_max", Jpo.DATE);
		pResult.input("catalogo_id", Jpo.DECIMAL);
		pResult.input("fecha_modificacion_min", Jpo.DATE);
		pResult.input("fecha_modificacion_max", Jpo.DATE);
		pResult.input("sku", Jpo.STRING);
		pResult.input("fecha_vencimiento_from", Jpo.DATE);
		pResult.input("fecha_vencimiento_to", Jpo.DATE);
		pResult.input("store_subcategory_id", Jpo.INTEGER);
		pResult.input("short_desc", Jpo.STRING);
		pResult.input("addtional_info", Jpo.STRING);
		pResult.input("shipp_returns", Jpo.STRING);
		pResult.input("sale_price_min", Jpo.DECIMAL);
		pResult.input("sale_price_max", Jpo.DECIMAL);
		pResult.input("page", Jpo.INTEGER);
		pResult.input("size", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaProductoEliminar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaProductoEliminar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_producto_eliminar","DES");
		pResult.input("tienda_producto_id", Jpo.DECIMAL);
		pResult.input("usuario_modificacion_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaProductoAdjuntoEliminar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaProductoAdjuntoEliminar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_producto_adjunto_eliminar","DES");
		pResult.input("tienda_producto_id", Jpo.DECIMAL);
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("adjunto_id", Jpo.DECIMAL);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}