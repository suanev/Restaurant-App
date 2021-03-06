package com.suanev.restaurant.service;

import com.suanev.restaurant.domain.Cliente;
import com.suanev.restaurant.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido pedido);

    void sendEmail(SimpleMailMessage message);

    void sendNewPasswordEmail(Cliente cliente, String newPass);
}
