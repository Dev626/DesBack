package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESpedidoDetalleServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESpedidoDetalleServiceImp extends DESpedidoDetalleService {

	@RequestMapping(value = "/despedidoDetalleObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object despedidoDetalleObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.despedidoDetalleObtener(ppo, request);
	}

}