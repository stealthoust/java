package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Okna {

    public static int statuszalogowany=0;

    public static int scenamenu=0;
    public static int scenarej=0;
    public static int scenalog=1;
    public static int scenazam=0;

    public static String nazwa;
    public static String adres;

    static Stage menuStage=new Stage();
    static Stage rejestracjaStage=new Stage();
    static Stage loginStage=new Stage();
    static Stage zamowienieStage=new Stage();


    public void utworzkontoForm()
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
            if(scenarej==0)
            rejestracjaStage.initStyle(StageStyle.UNDECORATED);
            rejestracjaStage.setScene(new Scene(root, 613, 673));
            rejestracjaStage.show();

        }

        catch(Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }

    }


    public void utworzMenuForm()
    {
        try
        {

            Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
            if(scenamenu==0)
             menuStage.initStyle(StageStyle.UNDECORATED);
            menuStage.setScene(new Scene(root, 851, 819));
            menuStage.show();

        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }


    }

    public void utworzLoginForm()
    {
        try
        {

            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            if(scenalog==0)
                loginStage.initStyle(StageStyle.UNDECORATED);
            loginStage.setScene(new Scene(root, 696, 477));
            loginStage.show();

        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }


    }

    public void utworzZamowienieForm()

    {
        try
        {

            Parent root = FXMLLoader.load(getClass().getResource("zamowienie.fxml"));
            if(scenazam==0)
                zamowienieStage.initStyle(StageStyle.UNDECORATED);
            zamowienieStage.setScene(new Scene(root, 601, 506));
            zamowienieStage.show();

        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }


    }
}
