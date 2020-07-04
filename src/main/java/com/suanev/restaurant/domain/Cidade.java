package com.suanev.restaurant.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    public Cidade() {}

    public Cidade(Integer id, String nome, Estado estado) {
        Id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return Objects.equals(Id, cidade.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
