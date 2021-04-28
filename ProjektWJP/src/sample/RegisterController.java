package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class RegisterController extends Okna implements Initializable {

@FXML
private ImageView zdjecieWidok2;
@FXML
private Button zamknijButton;
@FXML
private Label alertregister;
@FXML
private PasswordField ustawhaslo;
@FXML
private PasswordField ustawhaslo2;
@FXML
private Label alertpotwierdzhaslo;
@FXML
private TextField poleimie;
@FXML
private TextField polenazwisko;
@FXML
private TextField ustawlogin,ustawadres;
@FXML
private Button wyczyscButton;
@FXML
private Button mjkButton;

    public RegisterController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        File plik2= new File("zdj/pobrane.png");
        Image plikzdjecie2= new Image(plik2.toURI().toString());
        zdjecieWidok2.setImage(plikzdjecie2);
    }


    public void registerButtonAction(ActionEvent event)
    {
        if(ustawhaslo.getText().equals(ustawhaslo2.getText()))
        {   rejestracjaUser();
            alertpotwierdzhaslo.setText("");


        }
        else
        {
            alertpotwierdzhaslo.setText("Hasla sie nie zgadzaja!!");
        }



    }

    public void zamknijButtonAction(ActionEvent event)
    {
    rejestracjaStage.close();


    }

    public void wyczyscButtonAction ()
    {
        poleimie.setText("");
        polenazwisko.setText("");
        ustawlogin.setText("");
        ustawhaslo.setText("");
        ustawhaslo2.setText("");
        alertregister.setText("");
        alertpotwierdzhaslo.setText("");
        ustawadres.setText("");
    }

    public void mjkButtonAction (ActionEvent event)
    {
        rejestracjaStage.close();
        utworzLoginForm();
    }


    public void rejestracjaUser()
    {
        sample.BazaDanychConnect polaczenie= new sample.BazaDanychConnect();
        Connection polaczDB= polaczenie.getConnection();

        String imie=poleimie.getText();
        String nazwisko=polenazwisko.getText();
        String login=ustawlogin.getText();
        String haslo=ustawhaslo.getText();
        String adres=ustawadres.getText();
        String kodsql = "INSERT INTO users (imie,nazwisko,login,haslo,adres) VALUES('";
        String wpisane = imie + "','" + nazwisko + "','" + login + "','" + haslo + "','" +adres+ "')";
        String wpisanerejestracja = kodsql + wpisane;




           try {

               if(poleimie.getLength()<3 || poleimie.getLength()>20 ||
               polenazwisko.getLength()<3 || polenazwisko.getLength()>20 ||
               ustawlogin.getLength()<3 || ustawlogin.getLength()>20 ||
               ustawhaslo.getLength()<3 || ustawhaslo.getLength()>20 ||
               ustawadres.getLength()<3 || ustawadres.getLength()>20
               )
               {
                alertregister.setText("Wszystkie powyższe pola muszą mieć 3-20 znakow!");
               }
         else{
                   Statement statement = polaczDB.createStatement();
                   statement.executeUpdate(wpisanerejestracja);
                   wyczyscButtonAction();
                   alertregister.setText("Rejestracja przebiegła pomyślnie. Możesz zalogować się na swoje konto!");
               }
            }


        catch(Exception e)
        {
            //e.printStackTrace();
            //e.getCause();
            alertregister.setText("Podany login istnieje juz w bazie!");
        }



    }




}
