package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESPrincipalWebService {

	@RequestMapping(value = "/deswebStoreInit", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object deswebStoreInit(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.web_store_init","DES");
		pResult.input("virtual_store_domain", Jpo.STRING);
		Object ohb_response = pResult.execute();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/deswebStoreGetInfo", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object deswebStoreGetInfo(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.web_store_get_info","DES");
		pResult.input("tienda_id", Jpo.INTEGER);
		Object ohb_response = pResult.execute();
		ppo.commit();
		return new Response(ohb_response);
	}

}