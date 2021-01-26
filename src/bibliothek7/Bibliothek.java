package bibliothek7;

public class Bibliothek {

    private static final Bibliothek ini = new Bibliothek();

    private Bibliothek(){

    }

    public void neuesMedium(Medium m){
        m.toString();
    }

    public static Bibliothek getIni() {
        return ini;
    }

}
