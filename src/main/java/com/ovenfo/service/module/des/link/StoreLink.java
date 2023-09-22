package com.ovenfo.service.module.des.link;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.Procedure;

@RestController
@RequestMapping("/store")
public class StoreLink {
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/{id}", method = {RequestMethod.GET})
	public Object desatributoEditar(@PathVariable("id") int id, HttpServletRequest request) throws Exception {
		
		String img = "https://firebasestorage.googleapis.com/v0/b/stone-net-265023.appspot.com/o/OVN_PROD%2FADM%2F6dcf6d83-367a-45ef-856d-2ae6d14e9a99?alt=media&token=51c8af6b-731f-4571-8b6c-8c30f57905fb";
		String host = System.getenv("JPO_HOST")+"/#/Store/"+id;
		
		Jpo ppo = new Jpo();
		Procedure pResult = ppo.procedure("des.tienda_obtener_detalle");
		pResult.input("tienda_id", ""+id, Jpo.INTEGER);
		
		try {
			
			Map<String, Object> ohb_response = (Map<String, Object>) pResult.execute(true);
			
			
			if(ohb_response.get("adjunto_logo_url") != null) {
				img = ""+ohb_response.get("adjunto_logo_url");
			}
			
			return "<html><head>"
					+ "<title>"+ohb_response.get("nombre")+"</title>\r\n" + 
					"<meta http-equiv=\"Cache-control\" content=\"public, max-age=120, s-maxage=240\" />\r\n" + 
					"<meta name=\"description\"        	content=\"TIENDA DE "+ohb_response.get("categoria_nombre")+"\" />\r\n" + 
					"<meta property=\"og:title\"       	content=\""+ohb_response.get("nombre")+"\" />\r\n" + 
					"<meta property=\"og:description\" 	content=\"TIENDA DE "+ohb_response.get("categoria_nombre")+"\" />\r\n" + 
					"<meta property=\"og:image\"       	content=\""+img+"\" />"
					+ "</head><body><script> document.location.href='"+host+"';</script></body></html>";
			
		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
		

	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/{id}/product/{prod}", method = {RequestMethod.GET})
	public Object desatributoEditar(@PathVariable("id") int id, @PathVariable("prod") int prod, HttpServletRequest request) throws Exception {

		String img = "https://firebasestorage.googleapis.com/v0/b/stone-net-265023.appspot.com/o/OVN_PROD%2FDES%2Fno_product_image.png?alt=media&token=6e831865-becf-4452-b6c1-20c5f5b4ff35";
		String host = System.getenv("JPO_HOST")+"/#/Store/"+id+"/Product/"+prod;
		
		Jpo ppo = new Jpo();
		Procedure pResult = ppo.procedure("des.pedido_tienda_producto_obtener");
		pResult.input("tienda_producto_id", ""+prod, Jpo.INTEGER);
		
		try {
			
			Map<String, Object> ohb_response = (Map<String, Object>) pResult.execute(true);
			
			String detalle = ohb_response.get("nombre")+" "+ohb_response.get("simbolo")+" "+ohb_response.get("precio");

			if(ohb_response.get("url") != null) {
				img = ""+ohb_response.get("url");
			}
			
			return "<html><head>"
					+ "<title>"+ohb_response.get("tienda_nombre")+"</title>\r\n" + 
					"<meta http-equiv=\"Cache-control\" content=\"public, max-age=120, s-maxage=240\" />\r\n" + 
					"<meta property=\"og:title\"       	content=\""+ohb_response.get("tienda_nombre")+"\" />\r\n" + 
					"<meta name=\"description\"        	content=\""+detalle+"\" />\r\n" + 
					"<meta property=\"og:description\" 	content=\""+detalle+"\" />\r\n" + 
					"<meta property=\"og:image\"       	content=\""+img+"\" />"
					+ "</head><body><script> document.location.href='"+host+"';</script></body></html>";
			
		} catch (Exception e) {
			// TODO: handle exception
			return "";
		}
		

	}

}
