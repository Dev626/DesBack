package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESPrincipalServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESPrincipalServiceImp extends DESPrincipalService {

	@RequestMapping(value = "/desinicializar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desinicializar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desinicializar(ppo, request);
	}

}