package util;

import javax.swing.plaf.metal.MetalDesktopIconUI;
import java.io.*;
import java.util.ArrayList;

public class Bibliothek{

    private static final Bibliothek ini = new Bibliothek();
    private final String filepath=  "F://javaDateiTest/dat.dom";

    public ArrayList<Medium> vc;

    private Bibliothek(){
        vc = new ArrayList<Medium>();
    }

    public void SpeicherAlleMedien() {
        for(Medium m : vc) {
            try {
                ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(filepath, true));
                o.writeObject(vc);
                o.close();

            } catch (IOException e) {
                System.err.println(e);
                break;
            }
        }
    }

    public void LadeAlleMedeien() {
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream (filepath));
            //System.err.println(((Medium)o.readObject()).toString());
            vc = (ArrayList<Medium>) o.readObject();
            o.close();
        }
        catch ( IOException e ) {
            System.err.println( e );
        }
        catch ( ClassNotFoundException e ) {
            System.err.println( e );
        }
    }


    public void neuesMedium(Medium m){
        vc.add(m);
    }
    public void loscheMedium(String ISBN){
        int i = 0;

        for(Medium m : vc){
            if(m.getIsbn().equals(ISBN)){
                vc.remove(i);
                break;
            }
            i++;
        }
    }

    public void zeigeAlleMedien(){
        for(Medium m : vc){
            System.out.println(m.toString());
        }
    }

    public static Bibliothek getIni() {
        return ini;
    }

}
