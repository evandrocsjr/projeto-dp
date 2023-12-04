package dao;

import model.Usuario;
import conexao.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {
    private Conexao conexao;
    private Connection conn;

    public UsuarioDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }

    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome, email, cargo) VALUES (?, ?, ?);";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getCargo());

            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir usuário: " + ex.getMessage());
        }
    }

    public Usuario getUsuario(long id) {
        String sql = "SELECT * FROM usuario WHERE id = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            Usuario usuario = new Usuario();

            rs.first();
            usuario.setId(id);
            usuario.setNome(rs.getString("nome"));
            usuario.setEmail(rs.getString("email"));
            usuario.setCargo(rs.getString("cargo"));

            return usuario;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar usuário: " + ex.getMessage());
            return null;
        }
    }

    public void editar(Usuario usuario) {
        try {
            String sql = "UPDATE usuario SET nome=?, email=?, cargo=? WHERE id=?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getCargo());
            stmt.setLong(4, usuario.getId());

            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar o usuário: " + ex.getMessage());
        }
    }

    public void excluir(long id) {
        try {
            String sql = "DELETE FROM usuario WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir usuário: " + ex.getMessage());
        }
    }

    public List<Usuario> getUsuarios() {
        String sql = "SELECT * FROM usuario";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = stmt.executeQuery();
            List<Usuario> listaUsuarios = new ArrayList<>();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getLong("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCargo(rs.getString("cargo"));

                listaUsuarios.add(usuario);
            }
            return listaUsuarios;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todos os usuários: " + ex.getMessage());
            return null;
        }
    }

    public List<Usuario> getUsuariosNome(String nome) {
        String sql = "SELECT * FROM usuario WHERE nome LIKE ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();
            List<Usuario> listaUsuarios = new ArrayList<>();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getLong("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCargo(rs.getString("cargo"));

                listaUsuarios.add(usuario);
            }
            return listaUsuarios;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todos os usuários: " + ex.getMessage());
            return null;
        }
    }
    
    public Usuario getUsuarioByIdOrNome(long id, String nome) {
        String sql = "SELECT * FROM usuario WHERE (id = ? OR ? = 0) AND nome LIKE ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            stmt.setLong(1, id);
            stmt.setLong(2, id);  
            stmt.setString(3, "%" + nome + "%");

            ResultSet rs = stmt.executeQuery();
            if (rs.first()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getLong("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCargo(rs.getString("cargo"));

                return usuario;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar usuário por ID ou Nome: " + ex.getMessage());
        }
        return null;
    }
}
