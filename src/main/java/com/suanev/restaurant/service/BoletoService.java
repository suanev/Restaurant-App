package com.suanev.restaurant.service;

import com.suanev.restaurant.domain.PagamentoComBoleto;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class BoletoService {

    public void preencherPagamentoComBoleto(PagamentoComBoleto pagamentoComBoletoto, Date datePedido) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(datePedido);
        cal.add(Calendar.DAY_OF_MONTH, 7);
        pagamentoComBoletoto.setDataVencimento(cal.getTime());
    }
}
