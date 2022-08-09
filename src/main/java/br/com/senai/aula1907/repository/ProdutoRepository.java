package br.com.senai.aula1907.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.aula1907.orm.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Integer> {
	
}
