package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
      public Connection getConexao(){
        try{
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bd_dp?useTimezone=true&serverTimezone=UTC",
                    "root", "root"
            );
            return conn;
        }
        catch(Exception e){
            System.out.println("Erro ao conectar ao banco: "+ e.getMessage());
            return null;
        }
        
    }
}
