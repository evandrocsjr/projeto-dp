package model;

import java.util.Date;
import java.util.Objects;

public class Produto {
    private Long id;
    private String descricao;
    private double precoCusto;
    private int estoque;
    private Date validade;

    public Produto() {
    }

    public Produto(String descricao, double precoCusto, int estoque, Date validade) {
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.estoque = estoque;
        this.validade = validade;
    }

    public Produto(Long id, String descricao, double precoCusto, int estoque, Date validade) {
        this.id = id;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.estoque = estoque;
        this.validade = validade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.descricao;
    }
}
