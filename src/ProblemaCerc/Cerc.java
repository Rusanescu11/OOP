package ProblemaCerc;

public class Cerc {
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }
    public double getAria(){
        double Pi= 3.14;
        double aria= Pi*(this.raza*this.raza);
        return aria;
    }
}
