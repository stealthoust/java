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
    private Button przyciskanuluj;
@FXML
private Label alertlogin;
@FXML
private ImageView zdjecieWidok;
@FXML
private TextField  polelogin;
@FXML
private TextField polehaslo;

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

    public void weryfikacjaLogin()
    {
        sample.BazaDanychConnect polaczenie= new sample.BazaDanychConnect();
        Connection polaczDB= polaczenie.getConnection();

        String werLogin="SELECT count(1) FROM users WHERE login = '" + polelogin.getText() + "' AND haslo = '" + polehaslo.getText() +" ' ";

        try
        {
            Statement statement = polaczDB.createStatement();
            ResultSet queryResult = statement.executeQuery(werLogin);

            while(queryResult.next())
            {
                if (queryResult.getInt(1)==1)
                {
                   // alertlogin.setText("Gratulacje!");
                    utworzkontoForm();
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

    public void utworzkontoForm()
    {
try
{
    Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
    Stage rejestracjaStage=new Stage();
    rejestracjaStage.initStyle(StageStyle.UNDECORATED);
    rejestracjaStage.setScene(new Scene(root, 520, 626));
    rejestracjaStage.show();

}

catch(Exception e)
{
    e.printStackTrace();
    e.getCause();
}


    }
}
