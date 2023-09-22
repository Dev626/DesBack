package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESComercianteService {

	@RequestMapping(value = "/destiendaComerciantePedidoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaComerciantePedidoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_comerciante_pedido_listar","DES");
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

	@RequestMapping(value = "/destiendaComercianteObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destiendaComercianteObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.tienda_comerciante_obtener","DES");
		pResult.input("usuario_id", Jpo.DECIMAL);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}