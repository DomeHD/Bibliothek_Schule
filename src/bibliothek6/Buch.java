package bibliothek6;

public class Buch extends Medium{

    private int seitenAnzahl = 0;
    private String ISBN;

    public Buch(){

    }
    public Buch(int seitenAnzahl, String ISBN, String titel, String autor, String verlag){
        this.seitenAnzahl = seitenAnzahl;
        this.ISBN = ISBN;
        this.title = titel;
        this.autor = autor;
        this.verlag = verlag;

        this.mediennnummmer  = holenNaechsteFreieMediennummer ();
    }



    public String toString(){
        return "Das Buch ( " + mediennnummmer  +" ) hat:\n" +
                seitenAnzahl + " Seiten" + "\n" +
                "Den ISBN: " + getISBN() + "\n" +
                "den Titel: " + getTitle() + "\n" +
                "Den Autor: " + getAutor() + "\n" +
                "Den Verlag: " + getVerlag() + "\n";
    }

    public int getBuchNummer() {
        return mediennnummmer ;
    }

    public int getSeitenAnzahl() {
        return seitenAnzahl;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setBuchNummer(int buchNummer) {
        this.mediennnummmer = buchNummer;
    }

    public void setSeitenAnzahl(int seitenAnzahl) {
        this.seitenAnzahl = seitenAnzahl;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setVerlag(String verlag) {
        verlag = verlag;
    }
}
