package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland")
public class DESUsuarioService {

	@RequestMapping(value = "/desusuarioRegistrarTiendaNuevo", method = {RequestMethod.POST})
	public Object desusuarioRegistrarTiendaNuevo(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.usuario_registrar_tienda_nuevo","DES");
		pResult.input("razon_social", Jpo.STRING);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("apellido_paterno", Jpo.STRING);
		pResult.input("apellido_materno", Jpo.STRING);
		pResult.input("correo", Jpo.STRING);
		pResult.input("clave", Jpo.STRING);
		pResult.input("sistema_id", Jpo.DECIMAL);
		pResult.input("unidad_negocio_id", Jpo.INTEGER);
		pResult.output("estado", Jpo.INTEGER);
		pResult.output("mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/desusuarioDireccionListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desusuarioDireccionListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.usuario_direccion_listar","DES");
		pResult.input("unidad_negocio_id", Jpo.INTEGER);
		pResult.input("telefono", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}