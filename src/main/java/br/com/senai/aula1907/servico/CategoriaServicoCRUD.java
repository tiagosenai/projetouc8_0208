package br.com.senai.aula1907.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.aula1907.orm.Categoria;
import br.com.senai.aula1907.repository.CategoriaRepository;

@Service
public class CategoriaServicoCRUD implements CategoriaServico{
	
	@Autowired
	private CategoriaRepository repositorio;
	
	public List<Categoria> listarCategorias(){
		return (List<Categoria>) repositorio.findAll();
	}
	
	public void apagarCategorias(Integer id) {
		repositorio.deleteById(id);
	}
	
	public Categoria consultarCategoriasId(Integer id) {
		return repositorio.findById(id).get();
	}
	
	public Categoria atualizarCategorias(Categoria categoria) {
		return repositorio.save(categoria);
	}
}
