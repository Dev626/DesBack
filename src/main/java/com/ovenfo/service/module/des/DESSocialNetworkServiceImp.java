package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESSocialNetworkServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESSocialNetworkServiceImp extends DESSocialNetworkService {

	@RequestMapping(value = "/desstoreSocialNetworkList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object desstoreSocialNetworkList(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desstoreSocialNetworkList(ppo, request);
	}

}