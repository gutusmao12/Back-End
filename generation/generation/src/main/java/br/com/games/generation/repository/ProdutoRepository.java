package br.com.games.generation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.games.generation.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);

}
