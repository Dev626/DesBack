package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESTiendaProductoWebService {

	@RequestMapping(value = "/destiendaProductoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
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
		pResult.input("page", Jpo.INTEGER);
		pResult.input("size", Jpo.INTEGER);
		Object ohb_response = pResult.execute();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/desstoreProductSubcategoryList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object desstoreProductSubcategoryList(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.store_product_subcategory_list","DES");
		pResult.input("pf_user_id", Jpo.INTEGER);
		pResult.input("tienda_producto_id", Jpo.DECIMAL);
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("store_subcategory_id", Jpo.INTEGER);
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
		pResult.input("pf_page", Jpo.INTEGER);
		pResult.input("pf_size", Jpo.INTEGER);
		Object ohb_response = pResult.execute();
		ppo.commit();
		return new Response(ohb_response);
	}

}