package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
      public Connection getConexao(){
        try{
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projetoasmar?useTimezone=true&serverTimezone=UTC",
                    "root", "0011"
            );
            return conn;
        }
        catch(Exception e){
            System.out.println("Erro ao conectar ao banco: "+ e.getMessage());
            return null;
        }
        
    }
}
