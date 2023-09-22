package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESSubCategoriaService {

	@RequestMapping(value = "/desstoreSubcategoryList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object desstoreSubcategoryList(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.store_subcategory_list","DES");
		pResult.input("pf_user_id", Jpo.INTEGER);
		pResult.input("store_subcategory_id", Jpo.INTEGER);
		pResult.input("store_id", Jpo.INTEGER);
		pResult.input("name", Jpo.STRING);
		pResult.input("active", Jpo.CHARACTER);
		pResult.input("user_registration_id", Jpo.DECIMAL);
		pResult.input("registration_date_from", Jpo.DATETIME);
		pResult.input("registration_date_to", Jpo.DATETIME);
		pResult.input("user_modification_id", Jpo.DECIMAL);
		pResult.input("modification_date_from", Jpo.DATETIME);
		pResult.input("modification_date_to", Jpo.DATETIME);
		pResult.input("pf_page", Jpo.INTEGER);
		pResult.input("pf_size", Jpo.INTEGER);
		Object ohb_response = pResult.execute();
		ppo.commit();
		return new Response(ohb_response);
	}

}