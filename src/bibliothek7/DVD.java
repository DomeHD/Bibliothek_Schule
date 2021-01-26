package bibliothek7;

public class DVD extends Medium {

    double kapazität = 4.3;

    public DVD(){

    }

    public DVD(double kapazität){
        this.kapazität = kapazität;
    }

    public double getKapazität() {
        return kapazität;
    }

    public void setKapazität(double kapazität) {
        this.kapazität = kapazität;
    }
}
