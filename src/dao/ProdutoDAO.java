package dao;

import conexao.Conexao;
import java.sql.Connection;

public class ProdutoDAO {
    
    private Connection conn;
    private Conexao conexao;
    
    public ProdutoDAO() {
        this.conexao = new Conexao();
        this.conn = conexao.getConexao();
    }
    
}
