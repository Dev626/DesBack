package com.ovenfo.service.module.des;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohRest.RestUtil;
import ohSolutions.ohRest.util.security.AesUtil;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/des/DESUsuarioServiceImp")
@JpoClass(source = "dsinland")
public class DESUsuarioServiceImp extends DESUsuarioService {

	@RequestMapping(value = "/desusuarioRegistrarTiendaNuevo", method = {RequestMethod.POST})
	public Object desusuarioRegistrarTiendaNuevo(Jpo ppo, HttpServletRequest request) throws Exception {
		AesUtil aes = new AesUtil();
		String password = ppo.getData("DES","clave");
        String descriptedKey = aes.decrypt(password);
		ppo.setData("DES","clave", new RestUtil().GetHashMD5(descriptedKey));
		return super.desusuarioRegistrarTiendaNuevo(ppo, request);
	}

}