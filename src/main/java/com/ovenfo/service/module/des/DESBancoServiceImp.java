package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESBancoServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESBancoServiceImp extends DESBancoService {

	@RequestMapping(value = "/desbancoListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object desbancoListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desbancoListar(ppo, request);
	}

}