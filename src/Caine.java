public class Caine {
    //clasa caine;
    //constructor cu nume;
    //constructor cu nume si culoare;
    //o metoda de schimbare a numelui
    private String nume;   //membrii clasei
    private String culoare;

public Caine(String nume){
    this.nume=nume;
}
    public Caine(String nume, String culoare) { //constructor
        this.nume = nume;
        this.culoare = culoare;

    }

    public void setNume(String noulNume) { //setar
        this.nume = noulNume;


    }
    public String getNume(){ //geter
    return this.nume;
    }
}

