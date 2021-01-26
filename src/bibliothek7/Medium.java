package bibliothek7;

public class Medium {

    public static int naechsteMediennummer = 0;

    public int mediennnummmer = 0;

    public String title;
    public String autor;
    public String verlag;

    public Medium(){

    }
    public Medium(String title, String verlag, String autor){
        this.title = title;
        this.autor = autor;
        this.verlag = verlag;

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
                "Den Autor: " + getAutor() + "\n" +
                "Den Verlag: " + getVerlag() + "\n";
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }
}
