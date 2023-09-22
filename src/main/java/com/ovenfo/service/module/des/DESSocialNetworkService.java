package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESSocialNetworkService {

	@RequestMapping(value = "/desstoreSocialNetworkList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object desstoreSocialNetworkList(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.store_social_network_list","DES");
		pResult.input("store_social_network_id", Jpo.INTEGER);
		pResult.input("store_id", Jpo.INTEGER);
		pResult.input("cat_type_social_network_id", Jpo.DECIMAL);
		pResult.input("url", Jpo.STRING);
		pResult.input("active", Jpo.CHARACTER);
		pResult.input("user_registration_id", Jpo.DECIMAL);
		pResult.input("date_register_from", Jpo.DATETIME);
		pResult.input("date_register_to", Jpo.DATETIME);
		pResult.input("user_modification_id", Jpo.DECIMAL);
		pResult.input("date_modification_from", Jpo.DATETIME);
		pResult.input("date_modification_to", Jpo.DATETIME);
		pResult.input("position", Jpo.INTEGER);
		pResult.input("pf_page", Jpo.INTEGER);
		pResult.input("pf_size", Jpo.INTEGER);
		Object ohb_response = pResult.execute();
		ppo.commit();
		return new Response(ohb_response);
	}

}