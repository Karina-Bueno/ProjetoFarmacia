package org.generation.farmacia.repository;

import java.util.List;


import org.generation.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //indica que é uma classe de repositório 
public interface ProdutoRepository extends JpaRepository<Produto, Long>{ //<qual o tipo de entidade que estamos trabalhando, qual o tipo de id>

	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);    //consulta pelo nome do produto, retorna uma lista

}
