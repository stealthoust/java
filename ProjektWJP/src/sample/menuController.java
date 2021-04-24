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
public Label zalogowanyjako,suma,filosc,hilosc,cilosc,promocja,fcena,hcena,ccena,menuAlert;
@FXML
private ImageView zkoszyk;
@FXML
    private ImageView zfrytki;
    @FXML
    private ImageView zburger;
    @FXML
    private ImageView zcola;

   static Integer iloscfrytki=0;
    static Integer iloscburger=0;
    static Integer ilosccola=0;
    static double zaplata=0;



public void fdAction()
{
iloscfrytki++;
filosc.setText("Ilość: "+iloscfrytki.toString()+" szt.");
sumujCena();
    menuAlert.setText("");
}

    public void hdAction()
    {
        iloscburger++;
        hilosc.setText("Ilość: "+iloscburger.toString()+" szt.");
        sumujCena();
        menuAlert.setText("");
    }

    public void cdAction()
    {

        ilosccola++;
        cilosc.setText("Ilość: "+ilosccola.toString()+" szt.");
        sumujCena();
        menuAlert.setText("");
    }

    public void foAction()
    {
        if (iloscfrytki>0)
        {

            iloscfrytki--;
            filosc.setText("Ilość: "+iloscfrytki.toString()+" szt.");
            sumujCena();
            menuAlert.setText("");
        }
    }


    public void hoAction()
    {
        if (iloscburger>0)
        {
            iloscburger--;
            hilosc.setText("Ilość: "+iloscburger.toString()+" szt.");
            sumujCena();
            menuAlert.setText("");
        }
    }

    public void coAction()
    {

        if (ilosccola>0)
        {
            ilosccola--;
            cilosc.setText("Ilość: "+ilosccola.toString()+" szt.");
            sumujCena();
            menuAlert.setText("");
        }
    }


private void sumujCena()
{
    if(statuszalogowany==1) {
        zaplata=iloscfrytki*4+ilosccola*3.5+iloscburger*6.50;
    }
    else zaplata=iloscfrytki*5+ilosccola*4+iloscburger*8;


suma.setText(zaplata+" zł");

}

    public void wyczyscZamowienie()
    {
        iloscfrytki=0;
        iloscburger=0;
        ilosccola=0;
        zaplata=0;
        menuAlert.setText("");
    }

public void wylogujAction()
{
menuStage.close();
statuszalogowany=0;
nazwa="";
utworzLoginForm();

}

public void zakonczAction()
{
    menuStage.close();
}

public void zalogujAction()
{
    menuStage.close();
    utworzLoginForm();

}

public void zamowAction()
{
    if(zaplata!=0) {
        menuStage.close();
        utworzZamowienieForm();
        scenazam = 1;
    }
    else {menuAlert.setText("Wybierz coś zanim zamówisz!");}
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
      menuAlert.setText("");
       wyczyscZamowienie();


if(statuszalogowany==1)
{
    zalogujButton.setVisible(false);
    registerButton.setVisible(false);
    zalogowanyjako.setText("Zalogowany jako: "+nazwa);

    promocja.setVisible(false);

    fcena.setText("4 zł");
    hcena.setText("6,50 zł");
    ccena.setText("3,50 zł");


}
else if (statuszalogowany==0)
{
    zalogowanyjako.setVisible(false);
    wylogujButton.setVisible(false);
}

   }



}
