package bibliothek6;

public class Startbibliothek {

    public static void main(String[] args){
        Buch[] bch = new Buch[3];

        for(int i = 0; i <= 2; i++){
            bch[i] = new Buch(i*5, "GUHZBH-EFEF-WEFWE-" + i, "Test-Buch " + i, "Test-autor", "Test-Verlag");
        }

        System.out.println(bch[0].toString());
        System.out.println(bch[1].toString());
        System.out.println(bch[2].toString());
    }

}
