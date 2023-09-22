package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESBannerService {

	@RequestMapping(value = "/desbannerList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desbannerList(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.banner_list","DES");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("banner_id", Jpo.INTEGER);
		pResult.input("title", Jpo.STRING);
		pResult.input("subtitle", Jpo.STRING);
		pResult.input("image_bg", Jpo.STRING);
		pResult.input("button_text", Jpo.STRING);
		pResult.input("button_link", Jpo.STRING);
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("active", Jpo.CHARACTER);
		pResult.input("user_registration_id", Jpo.DECIMAL);
		pResult.input("registration_date_from", Jpo.DATETIME);
		pResult.input("registration_date_to", Jpo.DATETIME);
		pResult.input("user_modification_id", Jpo.DECIMAL);
		pResult.input("modification_date_from", Jpo.DATETIME);
		pResult.input("modification_date_to", Jpo.DATETIME);
		pResult.input("pf_page", Jpo.INTEGER);
		pResult.input("pf_size", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/desbannerRegister", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desbannerRegister(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.banner_register","DES");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("title", Jpo.STRING);
		pResult.input("subtitle", Jpo.STRING);
		pResult.input("image_bg", Jpo.STRING);
		pResult.input("button_text", Jpo.STRING);
		pResult.input("button_link", Jpo.STRING);
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("active", Jpo.CHARACTER);
		pResult.input("user_registration_id", Jpo.DECIMAL);
		pResult.input("alias", Jpo.STRING);
		pResult.input("imagen", Jpo.STRING);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_result", Jpo.INTEGER);
		pResult.output("resp_message", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/desbannerEdit", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desbannerEdit(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("des.banner_edit","DES");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("banner_id", Jpo.INTEGER);
		pResult.input("title", Jpo.STRING);
		pResult.input("subtitle", Jpo.STRING);
		pResult.input("image_bg", Jpo.STRING);
		pResult.input("button_text", Jpo.STRING);
		pResult.input("button_link", Jpo.STRING);
		pResult.input("tienda_id", Jpo.INTEGER);
		pResult.input("active", Jpo.CHARACTER);
		pResult.input("user_modification_id", Jpo.DECIMAL);
		pResult.input("alias", Jpo.STRING);
		pResult.input("imagen", Jpo.STRING);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_result", Jpo.INTEGER);
		pResult.output("resp_message", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}