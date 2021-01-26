package bibliothek7;

public class Startbibliothek {

    public static void main(String[] args){
        Bibliothek b = Bibliothek.getIni();
        Buch[] bch = new Buch[3];

        for(int i = 0; i <= 2; i++){
            bch[i] = new Buch(i*5, "GUHZBH-EFEF-WEFWE-" + i, "Test-Buch " + i, "Test-autor", "Test-Verlag");
            b.neuesMedium(bch[i]);
        }

    }

}
