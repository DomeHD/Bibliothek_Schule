package util;

import java.util.GregorianCalendar;

public class DVD extends Medium {

    double kapazität = 4.3;

    public DVD(){

    }

    public DVD(String title, String verlag, String isbn, boolean ausgelehn, GregorianCalendar ruckgabedatum, double kapazität){
        this.title = title;
        this.isbn = isbn;
        this.verlag = verlag;

        this.ausgelehen = ausgelehn;
        this.ruckgabedatum = ruckgabedatum;

        this.kapazität = kapazität;

        this.mediennnummmer = holenNaechsteFreieMediennummer();
    }

    @Override
    public String toString(){
        return "Das Medium ( " + mediennnummmer  +" ) hat:\n" +
                "den Titel: " + getTitle() + "\n" +
                "Den ISBN: " + getIsbn() + "\n" +
                "Den Verlag: " + getVerlag() + "\n" +
                "Den Kapazität: " + getKapazität() + "\n" +
                "ausgelehn" + isAusgeliehn() + "\n" +
                "rückgabedatum" + getRuckgabedatum();
    }



    public double getKapazität() {
        return kapazität;
    }

    public void setKapazität(double kapazität) {
        this.kapazität = kapazität;
    }
}
