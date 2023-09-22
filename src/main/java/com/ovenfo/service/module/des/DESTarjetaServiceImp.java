package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESTarjetaServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESTarjetaServiceImp extends DESTarjetaService {

	@RequestMapping(value = "/destarjetaListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object destarjetaListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.destarjetaListar(ppo, request);
	}

}