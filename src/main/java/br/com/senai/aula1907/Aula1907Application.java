package br.com.senai.aula1907;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.senai.aula1907.orm.Categoria;
import br.com.senai.aula1907.repository.CategoriaRepository;

@SpringBootApplication
public class Aula1907Application implements CommandLineRunner {

	private final CategoriaRepository repository;
	
	public Aula1907Application(CategoriaRepository repository) {
		this.repository = repository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Aula1907Application.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception{
		Categoria cat1 = new Categoria();
		cat1.setDescricao("CALHAS E RUFOS");
		cat1.setAtivo("SIM");
		repository.save(cat1);
	}

}
