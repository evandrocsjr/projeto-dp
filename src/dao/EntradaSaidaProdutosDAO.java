/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.EntradaSaidaProdutos;
import conexao.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;

public class EntradaSaidaProdutosDAO {
    private Conexao conexao;
    private Connection conn;

    public EntradaSaidaProdutosDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(EntradaSaidaProdutos movimentacao) {
        String sql = "INSERT INTO Entrada_saida_produtos (id_produto, id_usuario, motivo, quantidade, data_hora) VALUES (?, ?, ?, ?, ?);";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setLong(1, movimentacao.getIdProduto().getId());
            stmt.setLong(2, movimentacao.getIdUsuario().getId());
            stmt.setString(3, movimentacao.getMotivo());
            stmt.setInt(4, movimentacao.getQuantidade());
            stmt.setDate(5, new java.sql.Date(movimentacao.getDataModificacao().getTime()));

            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir entrada/saída de produtos: " + ex.getMessage());
        }
    }

    public EntradaSaidaProdutos getMovimentacao(long id) {
        String sql = "SELECT * FROM Entrada_saida_produtos WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            EntradaSaidaProdutos movimentacao = new EntradaSaidaProdutos();
            Produto produto = new Produto();

            rs.first();
            movimentacao.setId(id);
            movimentacao.setIdProduto(new ProdutoDAO().getProduto(rs.getLong("id_produto")));
            movimentacao.setIdUsuario(new UsuarioDAO().getUsuario(rs.getLong("id_usuario")));
            movimentacao.setMotivo(rs.getString("motivo"));
            movimentacao.setQuantidade(rs.getInt("quantidade"));
            movimentacao.setDataModificacao(rs.getDate("data_hora"));

            return movimentacao;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar entrada/saída de produtos: " + ex.getMessage());
            return null;
        }
    }

    public void editar(EntradaSaidaProdutos movimentacao) {
        try {
            String sql = "UPDATE Entrada_saida_produtos SET id_produto=?, id_usuario=?, motivo=?, quantidade=?, data_hora=? WHERE id=?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, movimentacao.getIdProduto().getId());
            stmt.setLong(2, movimentacao.getIdUsuario().getId());
            stmt.setString(3, movimentacao.getMotivo());
            stmt.setInt(4, movimentacao.getQuantidade());
            stmt.setDate(5, new java.sql.Date(movimentacao.getDataModificacao().getTime()));
            stmt.setLong(6, movimentacao.getId());

            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar entrada/saída de produtos: " + ex.getMessage());
        }
    }

    public void excluir(long id) {
        try {
            String sql = "DELETE FROM Entrada_saida_produtos WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir entrada/saída de produtos: " + ex.getMessage());
        }
    }

    public List<EntradaSaidaProdutos> getMovimentacoes() {
        String sql = "SELECT * FROM Entrada_saida_produtos";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = stmt.executeQuery();
            List<EntradaSaidaProdutos> listaMovimentacoes = new ArrayList<>();

            while (rs.next()) {
                EntradaSaidaProdutos movimentacao = new EntradaSaidaProdutos();
                movimentacao.setId(rs.getLong("id"));
                movimentacao.setIdProduto(new ProdutoDAO().getProduto(rs.getLong("id_produto")));
                movimentacao.setIdUsuario(new UsuarioDAO().getUsuario(rs.getLong("id_usuario")));
                movimentacao.setMotivo(rs.getString("motivo"));
                movimentacao.setQuantidade(rs.getInt("quantidade"));
                movimentacao.setDataModificacao(rs.getDate("data_hora"));

                listaMovimentacoes.add(movimentacao);
            }
            return listaMovimentacoes;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas as movimentações: " + ex.getMessage());
            return null;
        }
    }

    public List<EntradaSaidaProdutos> getMovimentacoesMotivo(String motivo) {
        String sql = "SELECT * FROM Entrada_saida_produtos WHERE motivo LIKE ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, "%" + motivo + "%");
            ResultSet rs = stmt.executeQuery();
            List<EntradaSaidaProdutos> listaMovimentacoes = new ArrayList<>();

            while (rs.next()) {
                EntradaSaidaProdutos movimentacao = new EntradaSaidaProdutos();
                movimentacao.setId(rs.getLong("id"));
                movimentacao.setIdProduto(new ProdutoDAO().getProduto(rs.getLong("id_produto")));
                movimentacao.setIdUsuario(new UsuarioDAO().getUsuario(rs.getLong("id_usuario")));
                movimentacao.setMotivo(rs.getString("motivo"));
                movimentacao.setQuantidade(rs.getInt("quantidade"));
                movimentacao.setDataModificacao(rs.getDate("data_hora"));

                listaMovimentacoes.add(movimentacao);
            }
            return listaMovimentacoes;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas as movimentações: " + ex.getMessage());
            return null;
        }
    }
}
