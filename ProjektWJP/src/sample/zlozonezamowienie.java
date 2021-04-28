package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class zlozonezamowienie extends menuController implements Initializable {

   @FXML
    private Button wrocButton,zakonczButton;
   @FXML
    private Label zamfrytki,zamburger,zamcola,cena1,cena2,cena3,kwotasuma,adresfinal;


public void wrocAction()
{
    Stage stage = (Stage) wrocButton.getScene().getWindow();
    stage.close();

    utworzMenuForm();

}

public void zakonczAction()
{

    zamowienieStage.close();
}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        zamfrytki.setText("Frytki: "+iloscfrytki+" sztuk");
        zamburger.setText("Hamburger: "+iloscburger+" sztuk");
        zamcola.setText("Cola: "+ilosccola+" sztuk");
        kwotasuma.setText("Łączna kwota: "+zaplata+" zł");


try
{
    sample.BazaDanychConnect polaczenie= new sample.BazaDanychConnect();
    Connection polaczDB= polaczenie.getConnection();

    String kodsql = "INSERT INTO zamowienia (frytki_ilosc,hamburger_ilosc,cola_ilosc,kwota,adres) VALUES('";
    String wpisane = iloscfrytki + "','" + iloscburger + "','" + ilosccola + "','" + zaplata + "','" +adres+ "')";
    String wpisanezamowienie = kodsql + wpisane;

    Statement statement = polaczDB.createStatement();
    statement.executeUpdate(wpisanezamowienie);

    adresfinal.setText("Twoje zamówienie zostanie dostarczone na adres: \n "+adres);
}
catch (Exception e)
{
    adresfinal.setText("Cos poszlo nie tak z twoim zamowieniem!");
}


        if(statuszalogowany==1)
        {
            cena1.setText(iloscfrytki*4 +" zł");
            cena2.setText(iloscburger*6.5 +" zł");
            cena3.setText(ilosccola*3.5 +" zł");

        }
        else
        {
            cena1.setText(iloscfrytki*5 +" zł");
            cena2.setText(iloscburger*8 +" zł");
            cena3.setText(ilosccola*4 +" zł");
        }

    }
}
