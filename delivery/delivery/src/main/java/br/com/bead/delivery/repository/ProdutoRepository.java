package br.com.bead.delivery.repository;
import br.com.bead.delivery.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.until.List;


public class ProdutoRepository {
    List<Produto> findByNomeContainingIgnoreCase(String nome) {
        // Implementação do método para buscar produtos pelo nome
        return null; // Retornar a lista de produtos encontrados
    }
    
}
