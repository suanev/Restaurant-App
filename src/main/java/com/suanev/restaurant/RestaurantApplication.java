package com.suanev.restaurant;

import com.suanev.restaurant.Repositories.CategoriaRepository;
import com.suanev.restaurant.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class RestaurantApplication implements CommandLineRunner {
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//instanciando categorias
		Categoria categoria1 = new Categoria(null, "Especiais de Inverno");
		Categoria categoria2 = new Categoria(null, "Lanches");
		Categoria categoria3 = new Categoria(null, "Vegetariana");
		Categoria categoria4 = new Categoria(null, "Massas");
		Categoria categoria5 = new Categoria(null, "Doces e bolos");
		Categoria categoria6 = new Categoria(null, "Bebidas");

		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3, categoria4, categoria5, categoria6));
	}
}
