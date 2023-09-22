package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESPedidoService {

	@RequestMapping(value = "/despedidoRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object despedidoRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.pedido_registrar","DES");
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("usuario_nombres", Jpo.STRING);
		pResult.input("usuario_apellido_paterno", Jpo.STRING);
		pResult.input("usuario_registro_id", Jpo.DECIMAL);
		pResult.input("usuario_direccion", Jpo.STRING);
		pResult.input("usuario_longitud", Jpo.DECIMAL);
		pResult.input("usuario_latitud", Jpo.DECIMAL);
		pResult.input("usuario_telefono", Jpo.STRING);
		pResult.input("pedido_detalle", Jpo.STRING);
		pResult.input("usuario_direccion_id", Jpo.INTEGER);
		pResult.input("medio_pago", Jpo.INTEGER);
		pResult.input("monto_efectivo", Jpo.DECIMAL);
		pResult.input("tarjeta_id", Jpo.INTEGER);
		pResult.input("banco_id", Jpo.INTEGER);
		pResult.input("billetera_id", Jpo.INTEGER);
		pResult.input("tipo_entrega", Jpo.CHARACTER);
		pResult.input("tipo_atencion", Jpo.CHARACTER);
		pResult.input("descripcion", Jpo.STRING);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		pResult.output("resp_producto_validar", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/despedidoObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object despedidoObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.pedido_obtener","DES");
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/despedidoClienteListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object despedidoClienteListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.pedido_cliente_listar","DES");
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("estado", Jpo.DECIMAL);
		pResult.input("pedido_id", Jpo.INTEGER);
		pResult.input("tienda_nombre", Jpo.STRING);
		pResult.input("cliente", Jpo.STRING);
		pResult.input("page", Jpo.INTEGER);
		pResult.input("size", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/despedidoEditarEstado", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object despedidoEditarEstado(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.pedido_editar_estado","DES");
		pResult.input("pedido_id", Jpo.DECIMAL);
		pResult.input("estado", Jpo.DECIMAL);
		pResult.input("usuario_modificacion_id", Jpo.DECIMAL);
		pResult.input("comentario", Jpo.STRING);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/despedidoClienteBuscar", method = {RequestMethod.POST})
	public Object despedidoClienteBuscar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.pedido_cliente_buscar","DES");
		pResult.input("unidad_negocio_id", Jpo.INTEGER);
		pResult.input("latitud", Jpo.STRING);
		pResult.input("longitud", Jpo.STRING);
		pResult.input("distancia", Jpo.DECIMAL);
		pResult.input("tienda_nombre", Jpo.STRING);
		pResult.input("indicador_disponible", Jpo.CHARACTER);
		pResult.input("categoria_id", Jpo.DECIMAL);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/despedidoTiendaProductoListar", method = {RequestMethod.POST})
	public Object despedidoTiendaProductoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.pedido_tienda_producto_listar","DES");
		pResult.input("tienda_id", Jpo.DECIMAL);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("descripcion", Jpo.STRING);
		pResult.input("indicador_stock", Jpo.CHARACTER);
		pResult.input("precio_minimo", Jpo.DECIMAL);
		pResult.input("precio_maximo", Jpo.DECIMAL);
		pResult.input("orden_tipo", Jpo.INTEGER);
		pResult.input("page", Jpo.INTEGER);
		pResult.input("size", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/despedidoTiendaProductoObtener", method = {RequestMethod.POST})
	public Object despedidoTiendaProductoObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.pedido_tienda_producto_obtener","DES");
		pResult.input("tienda_producto_id", Jpo.DECIMAL);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/despedidoTiendaProductoFotoListar", method = {RequestMethod.POST})
	public Object despedidoTiendaProductoFotoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.pedido_tienda_producto_foto_listar","DES");
		pResult.input("tienda_producto_id", Jpo.DECIMAL);
		Object ohb_response = pResult.executeL();
		return new Response(ohb_response);
	}

}