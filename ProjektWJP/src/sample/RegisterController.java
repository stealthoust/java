package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {

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
TextField poleimie;
@FXML
TextField polenazwisko;
@FXML
TextField ustawlogin;

    public RegisterController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        File plik2= new File("zdj/HowToRegisterIcon.png");
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
        //alertregister.setText("Rejestracja przebiegła pomyślnie. Możesz zalogować się na swoje konto!");


    }

    public void zamknijButtonAction(ActionEvent event)
    {
    Stage stage =(Stage) zamknijButton.getScene().getWindow();
    stage.close();
    Platform.exit();

    }

    public void rejestracjaUser()
    {
        sample.BazaDanychConnect polaczenie= new sample.BazaDanychConnect();
        Connection polaczDB= polaczenie.getConnection();

        String imie=poleimie.getText();
        String nazwisko=polenazwisko.getText();
        String login=ustawlogin.getText();
        String haslo=ustawhaslo.getText();

        String kodsql="INSERT INTO users (imie,nazwisko,login,haslo) VALUES('";
        String wpisane=imie+"','"+nazwisko+"','"+login+"','"+haslo+"')";
        String wpisanerejestracja= kodsql+wpisane;

        try
        {
            Statement statement = polaczDB.createStatement();
            statement.executeUpdate(wpisanerejestracja);
            alertregister.setText("Rejestracja przebiegła pomyślnie. Możesz zalogować się na swoje konto!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }



    }
}
