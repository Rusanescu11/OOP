package ProblemaBloc;

public class Apartament {
    private String nume;
    private int numar;

    public Apartament(String nume, int numar) {
        this.nume = nume;
        this.numar = numar;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public void ListallFloor() {
        System.out.println(this.nume);
    }

        public void afiseaza(){

        System.out.print(this.nume);
    }
}
