package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESTiendaService {

	@RequestMapping(value = "/destiendaListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_listar","DES");
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("tienda_nombre", Jpo.STRING);
		pResult.input("propietario", Jpo.STRING);
		pResult.input("page", Jpo.INTEGER);
		pResult.input("size", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaEditarEstado", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaEditarEstado(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_editar_estado","DES");
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("estado", Jpo.DECIMAL);
		pResult.input("usuario_modificacion_id", Jpo.DECIMAL);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_editar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("empresa_direccion_id", Jpo.DECIMAL);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("telefono", Jpo.STRING);
		pResult.input("direccion", Jpo.STRING);
		pResult.input("longitud", Jpo.STRING);
		pResult.input("latitud", Jpo.STRING);
		pResult.input("categoria_id", Jpo.INTEGER);
		pResult.input("usuario_modificacion_id", Jpo.DECIMAL);
		pResult.input("fotos", Jpo.STRING);
		pResult.input("indicador_horario", Jpo.CHARACTER);
		pResult.input("indicador_entrega", Jpo.CHARACTER);
		pResult.input("indicador_recojo", Jpo.CHARACTER);
		pResult.input("indicador_catalogo", Jpo.CHARACTER);
		pResult.input("horarios", Jpo.STRING);
		pResult.input("medios_pago", Jpo.STRING);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaClienteObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object destiendaClienteObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_cliente_obtener","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("unidad_negocio_id", Jpo.INTEGER);
		pResult.input("usuario_id", Jpo.INTEGER);
		pResult.input("tienda_id", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaAdjuntoEliminar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaAdjuntoEliminar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_adjunto_eliminar","DES");
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("adjunto_id", Jpo.DECIMAL);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_obtener","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("tienda_id", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/destiendaRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_registrar","DES");
		pResult.input("key_user_id", Jpo.INTEGER);
		pResult.input("unidad_negocio_id", Jpo.DECIMAL);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("categoria_id", Jpo.DECIMAL);
		pResult.input("telefono", Jpo.STRING);
		pResult.input("direccion", Jpo.STRING);
		pResult.input("longitud", Jpo.STRING);
		pResult.input("latitud", Jpo.STRING);
		pResult.input("usuario_registro_id", Jpo.DECIMAL);
		pResult.input("fotos", Jpo.STRING);
		pResult.input("indicador_horario", Jpo.CHARACTER);
		pResult.input("indicador_entrega", Jpo.CHARACTER);
		pResult.input("indicador_recojo", Jpo.CHARACTER);
		pResult.input("indicador_catalogo", Jpo.CHARACTER);
		pResult.input("horarios", Jpo.STRING);
		pResult.input("medios_pago", Jpo.STRING);
		pResult.input("empresa_id", Jpo.INTEGER);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}