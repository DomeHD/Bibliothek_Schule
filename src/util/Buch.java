package util;

import java.util.GregorianCalendar;

public class Buch extends Medium {

    private int seitenAnzahl = 0;
    public String autor;

    public Buch(){

    }

    public Buch(String title, String verlag, String isbn, boolean ausgelehn, GregorianCalendar ruckgabedatum, String autor){
        this.title = title;
        this.isbn = isbn;
        this.verlag = verlag;

        this.ausgelehen = ausgelehn;
        this.ruckgabedatum = ruckgabedatum;

        this.autor = autor;

        this.mediennnummmer = holenNaechsteFreieMediennummer();
    }



    public String toString(){
        return "Das Medium ( " + mediennnummmer  +" ) hat:\n" +
                "den Titel: " + getTitle() + "\n" +
                "Den ISBN: " + getIsbn() + "\n" +
                "Den Verlag: " + getVerlag() + "\n" +
                "ausgelehn" + isAusgeliehn() + "\n" +
                "Seitanzahl" + getSeitenAnzahl() + "\n" +
                "rückgabedatum" + getRuckgabedatum();
    }


    public int getSeitenAnzahl() {
        return seitenAnzahl;
    }

    public void setSeitenAnzahl(int seitenAnzahl) {
        this.seitenAnzahl = seitenAnzahl;
    }

}
