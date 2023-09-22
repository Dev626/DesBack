package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESPedidoServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESPedidoServiceImp extends DESPedidoService {

	@RequestMapping(value = "/despedidoRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object despedidoRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.despedidoRegistrar(ppo, request);
	}

	@RequestMapping(value = "/despedidoObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object despedidoObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.despedidoObtener(ppo, request);
	}

	@RequestMapping(value = "/despedidoClienteBuscar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object despedidoClienteBuscar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.despedidoClienteBuscar(ppo, request);
	}

	@RequestMapping(value = "/despedidoTiendaProductoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object despedidoTiendaProductoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.despedidoTiendaProductoListar(ppo, request);
	}

	@RequestMapping(value = "/despedidoTiendaProductoObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object despedidoTiendaProductoObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.despedidoTiendaProductoObtener(ppo, request);
	}

	@RequestMapping(value = "/despedidoTiendaProductoFotoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object despedidoTiendaProductoFotoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.despedidoTiendaProductoFotoListar(ppo, request);
	}

}