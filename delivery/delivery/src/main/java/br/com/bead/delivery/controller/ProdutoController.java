package br.com.bead.delivery.controller;
import br.com.bead.delivery.model.Produto;
import br.com.bead.delivery.service.ProdutoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.service= produtoService;
    }

    @GetMapping
    public Produto criar(@RequestBody Produto Produto){
        return service.salvar(Produto);   
    }
}
    

