package main.java.br.com.tech4me.vendas.model;

import java.util.Calendar;

public class Venda {
    
    private Produto produto;
    private Calendar datavenda = Calendar.getInstance();
    private int qtVendida;

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Calendar getDatavenda() {
        return this.datavenda;
    }

    public void setDatavenda(Calendar datavenda) {
        this.datavenda = datavenda;
    }

    public int getQtVendida() {
        return this.qtVendida;
    }

    public void setQtVendida(int qtVendida) {
        this.qtVendida = qtVendida;
    }

}
