package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESBilleteraService {

	@RequestMapping(value = "/desbilleteraListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desbilleteraListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.billetera_listar","DES");
		pResult.input("billetera_id", Jpo.INTEGER);
		pResult.input("unidad_negocio_id", Jpo.DECIMAL);
		pResult.input("nombre", Jpo.STRING);
		pResult.input("page", Jpo.INTEGER);
		pResult.input("size", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}