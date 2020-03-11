package ProblemaBloc;

import java.util.ArrayList;
import java.util.List;

public class Etaj {
    private int nrEtaj;
    private List<Apartament> listadeApartamente = new ArrayList();

    public Etaj(int nrEtaj) {
        this.nrEtaj = nrEtaj;
    }

    public int getNrEtaj() {
        return nrEtaj;
    }

    public void setNrEtaj(int nrEtaj) {
        this.nrEtaj = nrEtaj;
    }

    public void addApartamente(Apartament a) {
        listadeApartamente.add(a);
    }

    public void afiseaza() {
        for (Apartament n : listadeApartamente) {

            System.out.print("||"+n.getNumar()+" "+n.getNume()+"||");
        }
    }
}
