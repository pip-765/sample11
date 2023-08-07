package com.example.demo;

import java.security.Principal;
import java.util.HashMap;

import org.keycloak.KeycloakPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	@GetMapping({"/", "index"})
	public Object index() {
		var auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth == null)
			return "(null)";
		
		var principal = auth.getPrincipal();
		if (principal == null || !(principal instanceof Principal))
			return "Principal is null.";
		
		@SuppressWarnings("rawtypes")
		var context = ((KeycloakPrincipal) principal).getKeycloakSecurityContext();
		if (context == null)
			return "Keycloak context is null.";
		
		var result = new HashMap<String, Object>();
		result.put("id-token", context.getIdToken());
		result.put("access-token", context.getToken());
		
		return result;
	}
}
