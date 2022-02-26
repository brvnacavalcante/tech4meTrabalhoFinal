package br.com.tech4me.produtos.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.produtos.model.Produto;

public interface ProdutoService {

    Produto criarProduto(Produto produto);
    List<Produto> obterProdutos();
    Optional<Produto> produtoPorCodigo();
    void removerProduto();
    Produto atualizarProduto(String codigo, Produto produto);
    
}
