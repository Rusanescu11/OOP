package ExercitiuRestaurant;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Masa {
    private int numarLocuri;
    private String nume;
    List<Rezervari> listaRezervareMasa = new ArrayList<>();

    public Masa(int numarLocuri, String nume) {
        this.numarLocuri = numarLocuri;
        this.nume = nume;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public String getNume() {
        return nume;
    }
                                                //METODA
    private boolean verificaDacaDateleSeSuprapun(LocalDateTime newDate, LocalDateTime newDatePlecare) {
        for (Rezervari n : listaRezervareMasa) {
            if (n.getDataInceput().isEqual(newDate) || n.getDataInceput().isBefore(newDate) && n.getDataSfarsir().isAfter(newDate) ||
                    n.getDataInceput().isAfter(newDate) && n.getDataInceput().isBefore(newDatePlecare) || n.getDataInceput().isBefore(newDatePlecare) && n.getDataSfarsir().isEqual(newDatePlecare)
            ) {
                return true;
            } else
                return false;
        }
        return false;
    }
                                           //METODA
    private void adaugaPrimaRezervare(int numarPersoane, LocalDateTime newDate, LocalDateTime newDatePlecare, String numePersoanaCareRezerva) {
        Rezervari rezervare = new Rezervari(numarPersoane, newDate, newDatePlecare, numePersoanaCareRezerva);
        listaRezervareMasa.add(rezervare);
    }
                                           //METODA
    private Rezervari adaugaRezervare2(int numarPersoane, LocalDateTime newDate, LocalDateTime newDatePlecare, String numePersoanaCareRezerva) {
        Rezervari rezervare = new Rezervari(numarPersoane, newDate, newDatePlecare, numePersoanaCareRezerva);
        listaRezervareMasa.add(rezervare);
        return rezervare;
    }
                                            //METODA
    public Rezervari adaugaRezervareMasa(int a, LocalDateTime newDate, LocalDateTime newDatePlecare, String numePersoanaCareRezerva) {
        if (a <= this.getNumarLocuri()) {
            if (listaRezervareMasa.size() == 0) {
                adaugaRezervare2(a, newDate, newDatePlecare, numePersoanaCareRezerva);
            } else
                for (Rezervari n : listaRezervareMasa) {
                    if (verificaDacaDateleSeSuprapun(newDate, newDatePlecare)) {
                    } else
                        return adaugaRezervare2(a, newDate, newDatePlecare, numePersoanaCareRezerva);
                }
        }
        return null;
    }

    public void afiseazaRezervariMese() {           //METODA
        for (Rezervari n : listaRezervareMasa) {
            System.out.println("Rezervarea este efectuata in intervalul:  " + n.getDataInceput() + " - " + n.getDataSfarsir() + " Sunt prezente: " + n.getNumarPersoane() + " persoane, la masa: " + this.getNume() + " cu " + this.getNumarLocuri() + " locuri. Rezervarea a fost efectuata pe numele: " + n.getNumePersoaneCareauRezervatMasa());
        }
    }

    public void afiseazaRezervariMeseCautandDupaNume(String numePersoanaCareRezerva) {     //METODA
        for (Rezervari n : listaRezervareMasa) {
            if (numePersoanaCareRezerva.equals(n.getNumePersoaneCareauRezervatMasa())) {
                System.out.println(" " + n.getDataInceput() + "  " + n.getDataSfarsir() + " persoane " + n.getNumarPersoane()
                        + " la masa " + this.getNume() + " cu " + this.getNumarLocuri() +
                        " locuri. Rezervarea a fost efectuata pe numele: " + n.getNumePersoaneCareauRezervatMasa());
            }
        }
    }

    public boolean cautaRezervareDupaNume(String numePersoanaCareRezerv) {         //METODA
        for (Rezervari n : listaRezervareMasa) {
            if (numePersoanaCareRezerv.equals(n.getNumePersoaneCareauRezervatMasa())) {
                return true;
            }
        }
        return false;
    }
}

