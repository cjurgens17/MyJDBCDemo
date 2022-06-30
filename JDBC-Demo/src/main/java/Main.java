import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args){
        Connection connect = ConnectionManager.connect();


        try{
            System.out.println(connect.getClientInfo().isEmpty());
            System.out.println(connect.getSchema());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
