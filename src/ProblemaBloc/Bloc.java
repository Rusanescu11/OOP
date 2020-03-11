package ProblemaBloc;

import java.util.ArrayList;
import java.util.List;

public class Bloc {
    private String numee;
    private List<Etaj> listadeEtaje = new ArrayList();

    public Bloc(String nume) {
        this.numee = nume;
    }

    public String getNume() {
        return numee;
    }

    public void setNume(String nume) {
        this.numee = nume;
    }

    public void addEtaj(Etaj a) {
        listadeEtaje.add(a);
    }

    public void afiseaza() {
        for (Etaj n : listadeEtaje) {
            System.out.print("Et-" + n.getNrEtaj() + ": ");
        }
    }

    public Etaj cautaEtaj(int a) {
        for (Etaj n : listadeEtaje) {
            if (n.getNrEtaj() == a) {
                System.out.print( "Et :"+ n.getNrEtaj());
                return n;
            }
        }
        return  null;
    }
}





