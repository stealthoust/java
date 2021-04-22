package sample;
import java.sql.Connection;
import java.sql.DriverManager;


public class BazaDanychConnect {

    public Connection bazadanychLink;

    public Connection getConnection() {
        String bazaName="klienci";
        String bazaUser ="root";
        String bazaPassword ="";
        String url="jdbc:mysql://localhost/"+bazaName;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            bazadanychLink= DriverManager.getConnection(url,bazaUser,bazaPassword);

        } catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
 return bazadanychLink;
    }
}
