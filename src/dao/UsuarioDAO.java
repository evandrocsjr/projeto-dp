package dao;

import conexao.Conexao;
import java.sql.Connection;

public class UsuarioDAO {
    private Connection conn;
    private Conexao conexao;
    
    public UsuarioDAO() {
        this.conexao = new Conexao();
        this.conn = conexao.getConexao();
    }
}
