import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try {

            connection = dbHelper.getConnection();
            System.out.println("Bağlantı Oluştu");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from actor ");
            ArrayList<Actor> actors = new ArrayList<Actor>();

            while (resultSet.next()) {
                actors.add(new Actor(resultSet.getString("first_Name"), resultSet.getString("last_Name")));

            }
            for (int i = 0; i < actors.size(); i++) {

                System.out.println(actors.get(i).toString());


            }

        } catch (SQLException e) {
            dbHelper.showErrorMessage(e);

        } finally {
            connection.close();
        }

    }
}