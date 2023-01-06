package com.hkprogrammer.cursomc.resources;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hkprogrammer.cursomc.dto.EmailDTO;
import com.hkprogrammer.cursomc.security.JWTUtil;
import com.hkprogrammer.cursomc.security.UserSS;
import com.hkprogrammer.cursomc.services.AuthService;
import com.hkprogrammer.cursomc.services.UserService;

@RestController
@RequestMapping("/auth")
public class AuthResource {
	
	@Autowired
	private JWTUtil jwtUtil;
	
	@Autowired
	private AuthService service;
	
	@PostMapping("/refresh_token")
	public ResponseEntity<Void> refreshToken(HttpServletResponse response) {
		
		UserSS user = UserService.authenticated();
		String token = jwtUtil.generateToken(user.getUsername());
		response.addHeader("Authorization", "Bearer " + token);
		response.addHeader("access-control-expose-headers", "Authorization");
		return ResponseEntity.noContent().build();
		
	}
	
	@PostMapping("/forgot")
	public ResponseEntity<Void> forgot(@RequestBody @Valid EmailDTO objDTO) {
		
		service.sendNewPassword(objDTO.getEmail());
		return ResponseEntity.noContent().build();
		
	}
	
}
