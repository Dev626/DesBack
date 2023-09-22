package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESBancoService {

	@RequestMapping(value = "/desbancoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desbancoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.banco_listar","DES");
		pResult.input("banco_id", Jpo.INTEGER);
		pResult.input("unidad_negocio_id", Jpo.DECIMAL);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("adjunto_id", Jpo.DECIMAL);
		pResult.input("page", Jpo.INTEGER);
		pResult.input("size", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}