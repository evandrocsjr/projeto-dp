package model;

import java.util.Date;

public class EntradaSaidaProdutos {
    private Long id;
    private Produto idProduto;
    private Usuario idUsuario;
    private String motivo;
    private int quantidade;
    private Date dataModificacao;

    public EntradaSaidaProdutos() {
    }

    public EntradaSaidaProdutos(Produto idProduto, Usuario idUsuario, String motivo, int quantidade, Date dataModificacao) {
        this.idProduto = idProduto;
        this.idUsuario = idUsuario;
        this.motivo = motivo;
        this.quantidade = quantidade;
        this.dataModificacao = dataModificacao;
    }

    public EntradaSaidaProdutos(Long id, Produto idProduto, Usuario idUsuario, String motivo, int quantidade, Date dataModificacao) {
        this.id = id;
        this.idProduto = idProduto;
        this.idUsuario = idUsuario;
        this.motivo = motivo;
        this.quantidade = quantidade;
        this.dataModificacao = dataModificacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Date dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
}
