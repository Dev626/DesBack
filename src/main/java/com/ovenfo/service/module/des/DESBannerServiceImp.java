package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESBannerServiceImp")
@JpoClass(oauth2Enable = true)
public class DESBannerServiceImp extends DESBannerService {

	@RequestMapping(value = "/desbannerList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desbannerList(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desbannerList(ppo, request);
	}

	@RequestMapping(value = "/desbannerRegister", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desbannerRegister(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desbannerRegister(ppo, request);
	}

	@RequestMapping(value = "/desbannerEdit", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desbannerEdit(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desbannerEdit(ppo, request);
	}

}