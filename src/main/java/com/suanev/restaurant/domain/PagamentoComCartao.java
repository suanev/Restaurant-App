package com.suanev.restaurant.domain;


import com.suanev.restaurant.domain.enums.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento {

    private Integer numeroParcelas;

    public PagamentoComCartao(){}

    public PagamentoComCartao(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Integer numeroParcelas) {
        super(id, estadoPagamento, pedido);
        this.numeroParcelas = numeroParcelas;
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
}
