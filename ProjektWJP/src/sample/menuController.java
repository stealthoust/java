package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class menuController extends LoginController implements Initializable {

@FXML
  private Button fdButton,foButton,hdButton,hoButton,cdButton,coButton,wylogujButton,zalogujButton,registerButton,zamowButton;
@FXML
public Label zalogowanyjako,suma,filosc,hilosc,cilosc;
@FXML
private ImageView zkoszyk;
@FXML
    private ImageView zfrytki;
    @FXML
    private ImageView zburger;
    @FXML
    private ImageView zcola;

    Integer iloscfrytki=0;
    Integer iloscburger=0;
    Integer ilosccola=0;
    Integer zaplata=0;



public void fdAction()
{
iloscfrytki++;
filosc.setText("Ilość: "+iloscfrytki.toString()+" szt.");
sumujCena();
}

    public void hdAction()
    {
        iloscburger++;
        hilosc.setText("Ilość: "+iloscburger.toString()+" szt.");
        sumujCena();

    }

    public void cdAction()
    {

        ilosccola++;
        cilosc.setText("Ilość: "+ilosccola.toString()+" szt.");
        sumujCena();

    }

    public void foAction()
    {
        if (iloscfrytki>0)
        {

            iloscfrytki--;
            filosc.setText("Ilość: "+iloscfrytki.toString()+" szt.");
            sumujCena();
        }
    }

    public void hoAction()
    {
        if (iloscburger>0)
        {
            iloscburger--;
            hilosc.setText("Ilość: "+iloscburger.toString()+" szt.");
            sumujCena();
        }
    }

    public void coAction()
    {
        if (ilosccola>0)
        {
            ilosccola--;
            cilosc.setText("Ilość: "+ilosccola.toString()+" szt.");
            sumujCena();
        }
    }


private void sumujCena()
{ zaplata=iloscfrytki*5+ilosccola*4+iloscburger*8;
suma.setText(zaplata.toString()+" zł");

}

   @Override
   public void initialize(URL url, ResourceBundle resourceBundle) {
       File plik5= new File("zdj/sklep.png");
       Image plikzdjecie1= new Image(plik5.toURI().toString());
       zkoszyk.setImage(plikzdjecie1);

       File plik2= new File("zdj/fries.png");
       Image plikzdjecie2= new Image(plik2.toURI().toString());
       zfrytki.setImage(plikzdjecie2);

       File plik3= new File("zdj/burger.png");
       Image plikzdjecie3= new Image(plik3.toURI().toString());
       zburger.setImage(plikzdjecie3);

       File plik4= new File("zdj/cola.png");
       Image plikzdjecie4= new Image(plik4.toURI().toString());
       zcola.setImage(plikzdjecie4);

if(statuszalogowany==1)
{
    zalogujButton.setVisible(false);
    registerButton.setVisible(false);
    zalogowanyjako.setText("Zalogowany jako: "+nazwa);
}

   }



}
