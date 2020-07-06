package com.suanev.restaurant.service;

import com.suanev.restaurant.Repositories.ClienteRepository;
import com.suanev.restaurant.domain.Cliente;
import com.suanev.restaurant.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AuthService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private Random rand = new Random();

    @Autowired
    private EmailService emailService;

    public void sendNewPassword(String email) {
        Cliente cliente = clienteRepository.findByEmail(email);
        if(cliente == null) {
            throw new ObjectNotFoundException("Email não encontrado.");
        }

        String newPass = newPassword();
        cliente.setSenha(bCryptPasswordEncoder.encode(newPass));

        clienteRepository.save(cliente);
        emailService.sendNewPasswordEmail(cliente, newPass);
    }

    private String newPassword() {
        char[] vet = new char[10];
        for(int i = 0; i < 10; i++) {
            vet[i] = randomChar();
        }

        return new String(vet);
    }

    private char randomChar() {
        int opt = rand.nextInt(3);
        if(opt == 0) {
            return (char) (rand.nextInt(10) + 48);
        } else if(opt == 1) {
            return (char) (rand.nextInt(26) + 65);
        } else {
            return (char) (rand.nextInt(26) + 97);
        }
    }
}
