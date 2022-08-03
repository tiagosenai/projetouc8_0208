package br.com.senai.aula1907.servico;

import java.util.List;

import br.com.senai.aula1907.orm.Categoria;

public interface CategoriaServico {
	public List<Categoria> listarCategorias();
	
	public void apagarCategorias(Integer id);
	
	public Categoria consultarCategoriasId(Integer id);
	
	public Categoria atualizarCategorias(Categoria categoria);
}
