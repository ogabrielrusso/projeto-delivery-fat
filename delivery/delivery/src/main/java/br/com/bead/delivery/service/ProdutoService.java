package br.com.bead.delivery.service;
import br.com.bead.delivery.model.Produto;
import br.com.bead.delivery.repository.ProdutoRepository;
import org.springframework.stereotype.service;
import java.until.List;



@Service
public class ProdutoService {
    private final ProdutoRepository repository;
    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;

    }

    public List<Product> listarTodos() {
        return repository.findAll();
    } 
    
    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }
}
