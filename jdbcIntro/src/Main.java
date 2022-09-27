import java.sql.*;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws SQLException{
        Connection connection=null;
        DbHelper dbHelper= new DbHelper();
        Statement statement=null;
        ResultSet resultSet;

        try {

            connection=dbHelper.getConnection();
            System.out.println("Bağlantı Oluştu");
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select * from actor ");
            ArrayList<Actor> actors=new ArrayList<Actor>();
            String s;
            while (resultSet.next()){
                actors.add(new Actor(resultSet.getString("first_Name"),resultSet.getString("last_Name")));

            }
            for (int i = 0; i < actors.size(); i++) {
               s=actors.get(i).toString();

                System.out.println(s);
            }

        }
        catch (SQLException e){
            dbHelper.showErrorMessage(e);

        }
        finally {
            connection.close();
        }

    }
}