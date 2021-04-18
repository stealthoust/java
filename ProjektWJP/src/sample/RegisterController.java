package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
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
        alertregister.setText("Rejestracja przebiegła pomyślnie. Możesz zalogować się na swoje konto!");

    }

    public void zamknijButtonAction(ActionEvent event)
    {
    Stage stage =(Stage) zamknijButton.getScene().getWindow();
    stage.close();

    }

    public void rejestracjaUser()
    {
        if(ustawhaslo.getText().equals(ustawhaslo2.getText()))
        {


        }
        else
        {

        }

    }
}
