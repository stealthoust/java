package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class LoginController extends Okna implements Initializable {
    @FXML
    private Button przyciskanuluj,zamowButton,przyciskRegister;
@FXML
private Label alertlogin;
@FXML
private ImageView zdjecieWidok;
@FXML
private TextField  polelogin,polehaslo;




@Override
public void initialize(URL url, ResourceBundle resourceBundle)
{
    File plik= new File("zdj/kebab.gif");
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

        String werLogin="SELECT count(1),imie,nazwisko,adres FROM users WHERE login = '" + polelogin.getText() + "' AND haslo = '" + polehaslo.getText() +" ' ";

        try
        {
            Statement statement = polaczDB.createStatement();
            ResultSet queryResult = statement.executeQuery(werLogin);


            while(queryResult.next() )
            {
                if (queryResult.getInt(1)==1)
                {
                    nazwa=queryResult.getString(2)+" "+queryResult.getString(3);
                    adres=queryResult.getString(4);
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





}
