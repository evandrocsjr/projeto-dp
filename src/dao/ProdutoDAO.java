package dao;

import model.Produto;
import conexao.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {
    private Conexao conexao;
    private Connection conn;

    public ProdutoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Produto produto) {
        String sql = "INSERT INTO produto (descricao, precoCusto, estoque, validade) VALUES (?, ?, ?, ?);";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPrecoCusto());
            stmt.setInt(3, produto.getEstoque());
            stmt.setDate(4, new java.sql.Date(produto.getValidade().getTime())); // Converte a data para java.sql.Date

            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir produto: " + ex.getMessage());
        }
    }

    public Produto getProduto(long id) {
        String sql = "SELECT * FROM produto WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            Produto produto = new Produto();

            rs.first();
            produto.setId(id);
            produto.setDescricao(rs.getString("descricao"));
            produto.setPrecoCusto(rs.getDouble("precoCusto"));
            produto.setEstoque(rs.getInt("estoque"));
            produto.setValidade(rs.getDate("validade"));

            return produto;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar produto: " + ex.getMessage());
            return null;
        }
    }

    public void editar(Produto produto) {
        try {
            String sql = "UPDATE produto SET descricao=?, precoCusto=?, estoque=?, validade=? WHERE id=?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPrecoCusto());
            stmt.setInt(3, produto.getEstoque());
            stmt.setDate(4, new java.sql.Date(produto.getValidade().getTime())); // Converte a data para java.sql.Date
            stmt.setLong(5, produto.getId());

            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar o produto: " + ex.getMessage());
        }
    }

    public void excluir(long id) {
        try {
            String sql = "DELETE FROM produto WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir produto: " + ex.getMessage());
        }
    }

    public List<Produto> getProdutos() {
        String sql = "SELECT * FROM produto";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = stmt.executeQuery();
            List<Produto> listaProdutos = new ArrayList<>();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPrecoCusto(rs.getDouble("precoCusto"));
                produto.setEstoque(rs.getInt("estoque"));
                produto.setValidade(rs.getDate("validade"));

                listaProdutos.add(produto);
            }
            return listaProdutos;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todos os produtos: " + ex.getMessage());
            return null;
        }
    }

    public List<Produto> getProdutosDescricao(String descricao) {
        String sql = "SELECT * FROM produto WHERE descricao LIKE ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, "%" + descricao + "%");
            ResultSet rs = stmt.executeQuery();
            List<Produto> listaProdutos = new ArrayList<>();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPrecoCusto(rs.getDouble("precoCusto"));
                produto.setEstoque(rs.getInt("estoque"));
                produto.setValidade(rs.getDate("validade"));

                listaProdutos.add(produto);
            }
            return listaProdutos;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todos os produtos: " + ex.getMessage());
            return null;
        }
    }
}
