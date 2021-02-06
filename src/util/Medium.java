package util;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Medium implements Serializable,Ausleihe {

    public  static int naechsteMediennummer = 0;

    public int mediennnummmer = 0;

    public String title;
    public String isbn;
    public String verlag;

    public boolean ausgelehen;
    public GregorianCalendar ruckgabedatum;

    public Medium(){

    }
    public Medium(String title, String verlag, String isbn, boolean ausgelehn, GregorianCalendar ruckgabedatum){
        this.title = title;
        this.isbn = isbn;
        this.verlag = verlag;

        this.ausgelehen = ausgelehn;
        this.ruckgabedatum = ruckgabedatum;

        this.mediennnummmer = holenNaechsteFreieMediennummer();
    }


    public int holenNaechsteFreieMediennummer(){
        int erg = naechsteMediennummer ;
        naechsteMediennummer ++;

        return erg;
    }

    public String toString(){
        return "Das Medium ( " + mediennnummmer  +" ) hat:\n" +
                "den Titel: " + getTitle() + "\n" +
                "Den ISBN: " + getIsbn() + "\n" +
                "Den Verlag: " + getVerlag() + "\n" +
                "ausgelehn: " + isAusgeliehn() + "\n" +
                "rückgabedatum in " + getRuckgabedatum().getWeeksInWeekYear() + " Wochen.";
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public GregorianCalendar getRuckgabedatum() {
        return ruckgabedatum;
    }

    public void setRuckgabedatum(GregorianCalendar ruckgabedatum) {
        this.ruckgabedatum = ruckgabedatum;
    }

    @Override
    public void getRückgabeDatum() {
        ruckgabedatum = new GregorianCalendar();
        ruckgabedatum.add(Calendar.DATE, 28);
    }

    @Override
    public boolean isAusgeliehn() {
        return ausgelehen;
    }

    @Override
    public void ausleihen() {
        ausgelehen = true;
        getRückgabeDatum();
    }

    @Override
    public void zuruckgeben() {
        ausgelehen = false;
    }
}
