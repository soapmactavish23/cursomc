package com.hkprogrammer.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.hkprogrammer.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
