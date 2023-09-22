package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESpedidoDetalleService {

	@RequestMapping(value = "/despedidoDetalleObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object despedidoDetalleObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.pedido_detalle_obtener","DES");
		pResult.input("pedido_id", Jpo.DECIMAL);
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

}