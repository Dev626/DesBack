package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESSubCategoriaServiceImp")
@JpoClass(oauth2Enable = true)
public class DESSubCategoriaServiceImp extends DESSubCategoriaService {

	@RequestMapping(value = "/desstoreSubcategoryList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = false)
	public Object desstoreSubcategoryList(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.desstoreSubcategoryList(ppo, request);
	}

}