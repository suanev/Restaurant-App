package com.suanev.restaurant.dto;

import com.suanev.restaurant.domain.Categoria;

import java.io.Serializable;

public class CategoriaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private String img;

    public CategoriaDTO(){}

    public CategoriaDTO(Categoria categoria){
        id = categoria.getId();
        nome = categoria.getNome();
        img = categoria.getImg();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
