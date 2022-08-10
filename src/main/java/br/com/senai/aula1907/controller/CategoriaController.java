package br.com.senai.aula1907.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.aula1907.orm.Categoria;
import br.com.senai.aula1907.orm.Produtos;
import br.com.senai.aula1907.servico.CategoriaServico;
import br.com.senai.aula1907.servico.ProdutoServico;

@Controller
public class CategoriaController {
	
	@Autowired
	private CategoriaServico servico;
	@Autowired
	private ProdutoServico servicoProduto;
	
	@GetMapping({"/categoria"})
	public String listarCategorias(Model modelo) {
		modelo.addAttribute("categoria", servico.listarCategorias());
		return "categoria"; //mostrar a página categoria.html
	}
	
	@GetMapping({"/categoria/{id}"})
	public String apagarCategorias(@PathVariable Integer id) {
		servico.apagarCategorias(id);
		return "redirect:/categoria"; //mostrar a página categoria.html
	}
	
	@GetMapping({"/categoria/editar/{id}"})
	public String editarCategorias(@PathVariable Integer id, Model modelo) {
		modelo.addAttribute("categoria", servico.consultarCategoriasId(id));
		return "editarCategoria"; //mostrar a página Editar Categoria
	}
	
	@PostMapping("/categoria/{id}")
	public String atualizarCategorias(@PathVariable Integer id, @ModelAttribute("categoria") Categoria categoria, Model modelo) {
		Categoria cat = servico.consultarCategoriasId(id);
		cat.setId(id);
		cat.setDescricao(categoria.getDescricao());
		cat.setAtivo(categoria.getAtivo());
		servico.atualizarCategorias(cat);
		return "redirect:/categoria";
	}
	
	@GetMapping("/categoria/adicionar")
	public String adicionarCategorias(Model modelo) {
		Categoria categoria = new Categoria();
		modelo.addAttribute("categoria", categoria);
		return "formCategoria";
	}
	
	@PostMapping("/categoria")
	public String salvarCategorias(@ModelAttribute("categoria") Categoria categoria) {
		servico.salvarCategorias(categoria);
		return "redirect:/categoria";
	}
	
	@GetMapping("/produto")
	public String listarProdutos(Model modelo) {
		modelo.addAttribute("produtos", servicoProduto.listarProdutos());
		return "produto"; //mostrar a página categoria.html
	}
	
	@GetMapping("/produto/adicionar")
	public String adicionarProdutos(Model modelo) {
		Produtos produto = new Produtos();
		modelo.addAttribute("produtos", produto);
		return "formProduto";
	}
	
	@PostMapping("/produto")
	public String salvarProdutos(@ModelAttribute("produtos") Produtos produto) {
		servicoProduto.salvarProdutos(produto);
		return "redirect:/produto";
	}
	
	@GetMapping({"/produto/{id}"})
	public String apagarProdutos(@PathVariable Integer id) {
		servicoProduto.apagarProdutos(id);
		return "redirect:/produto";
	}
}
