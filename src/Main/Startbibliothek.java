package Main;

import GUI.GuiStartBibliohek;
import util.Bibliothek;
import util.Buch;
import util.Medium;

import java.util.GregorianCalendar;


public class Startbibliothek {

    public static void main(String[] args){
        Bibliothek b = Bibliothek.getIni();
      /*  b.LadeAlleMedeien();

        b.vc.get(0).getRückgabeDatum(); */

      new GuiStartBibliohek();

    }

}
