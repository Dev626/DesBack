package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESProductVariantWebServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class DESProductVariantWebServiceImp extends DESProductVariantWebService {

	@RequestMapping(value = "/desstoreProductVariantList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object desstoreProductVariantList(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desstoreProductVariantList(ppo, request);
	}

}