package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class LoginController implements Initializable {
    @FXML
    private Button przyciskanuluj,zamowButton,przyciskRegister;
@FXML
private Label alertlogin;
@FXML
private ImageView zdjecieWidok;
@FXML
private TextField  polelogin,polehaslo;

public static int statuszalogowany=0;

public static int scenamenu=0;
public static int scenarej=0;
public static int scenalog=1;
public static int scenazam=0;

public static String nazwa;

static Stage menuStage=new Stage();
static Stage rejestracjaStage=new Stage();
static Stage loginStage=new Stage();
static Stage zamowienieStage=new Stage();


@Override
public void initialize(URL url, ResourceBundle resourceBundle)
{
    File plik= new File("zdj/pobrane.jpg");
    Image plikzdjecie= new Image(plik.toURI().toString());
    zdjecieWidok.setImage(plikzdjecie);

}



    public void przyciskloginAction(ActionEvent event)
    {
        if(polelogin.getText().isBlank()==false && polehaslo.getText().isBlank()==false)
        {
            weryfikacjaLogin();
        }

        else
        {
            alertlogin.setText("Login lub hasło jest puste!");
        }


    }

    public void PrzyciskanulujAction(ActionEvent event)
    {
        Stage stage = (Stage) przyciskanuluj.getScene().getWindow();
        stage.close();

    }

    public void zamowButtonAction(ActionEvent event)
    {

        Stage stage = (Stage) zamowButton.getScene().getWindow();
        stage.close();

        utworzMenuForm();
        scenamenu=1;
    }

    public void weryfikacjaLogin()
    {
        BazaDanychConnect polaczenie= new BazaDanychConnect();
        Connection polaczDB= polaczenie.getConnection();

        String werLogin="SELECT count(1),imie,nazwisko FROM users WHERE login = '" + polelogin.getText() + "' AND haslo = '" + polehaslo.getText() +" ' ";

        try
        {
            Statement statement = polaczDB.createStatement();
            ResultSet queryResult = statement.executeQuery(werLogin);


            while(queryResult.next() )
            {
                if (queryResult.getInt(1)==1)
                {   nazwa=queryResult.getString(2)+" "+queryResult.getString(3);
                   // alertlogin.setText("Gratulacje!");

                    Stage stage = (Stage) zamowButton.getScene().getWindow();
                    stage.close();

                    statuszalogowany=1;
                        utworzMenuForm();
                        scenamenu=1;

                }
                else
                {
                    alertlogin.setText("Niepoprawne dane. Sprobuj ponownie!");
                }
            }

        } catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }

    }

    public void registerAction()
    {
        Stage stage = (Stage) zamowButton.getScene().getWindow();
        stage.close();

        utworzkontoForm();
        scenarej=1;
    }

    public void utworzkontoForm()
    {
try
{
    Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
    if(scenarej==0)
    rejestracjaStage.initStyle(StageStyle.UNDECORATED);
    rejestracjaStage.setScene(new Scene(root, 613, 621));
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
                menuStage.setScene(new Scene(root, 851, 647));
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
            zamowienieStage.setScene(new Scene(root, 600, 400));
            zamowienieStage.show();

        }
        catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }


    }



}
