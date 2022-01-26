package br.com.generation.projetoigarape.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.projetoigarape.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
		
	List<Categoria> findAllBySecaoContainingIgnoreCase(String secao);

}
