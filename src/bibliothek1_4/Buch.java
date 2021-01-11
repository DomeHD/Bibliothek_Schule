package bibliothek1_4;

public class Buch {

    private static int nextBuchNummer = 0;

    private int buchNummer = 0;
    private int seitenAnzahl = 0;
    private String ISBN;

    private String title;
    private String autor;
    private String verlag;

    public static void main(String[] args){
        Buch buch = new Buch(55, "GUHZBH-EFEF-WEFWE-89", "Test-Buch", "Test-autor", "Test-Verlag");

        System.out.println(buch.toString());
    }

    public Buch(){

    }
    public Buch(int seitenAnzahl, String ISBN, String titel, String autor, String verlag){
        this.seitenAnzahl = seitenAnzahl;
        this.ISBN = ISBN;
        this.title = titel;
        this.autor = autor;
        this.verlag = verlag;

        this.buchNummer = holenaechsteFreieBuchnummer();
    }

    public int holenaechsteFreieBuchnummer(){
        int erg = nextBuchNummer;
        nextBuchNummer++;

        return erg;
    }

    public String toString(){
        return "Das Buch ( " + buchNummer +" ) hat:\n" +
                seitenAnzahl + " Seiten" +
                "Den ISBN: " + getISBN() + "\n" +
                "den Titel: " + getTitle() + "\n" +
                "Den Autor: " + getAutor() + "\n" +
                "Den Verlag: " + getVerlag() + "\n";
    }

    public int getBuchNummer() {
        return buchNummer;
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
        this.buchNummer = buchNummer;
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


