package ProblemaBloc;

public class Main {
    public static void main(String[] args) {
        Bloc bloc = new Bloc("E2");
        Etaj etajul0 = new Etaj(0);
        Apartament ap1 = new Apartament(".Familia Popescu", 1);
        etajul0.addApartamente(ap1);
        Apartament ap2 = new Apartament(".Familia Ionescu", 2);
        etajul0.addApartamente(ap2);
        bloc.addEtaj(etajul0);
        bloc.afiseaza();
        etajul0.afiseaza();
        Etaj etajul1 = new Etaj(1);
        Apartament ap3 = new Apartament("Familia Georgescu", 3);
        etajul1.addApartamente(ap3);
        Apartament ap4 = new Apartament("Familia Vladimirescu", 4);
        etajul1.addApartamente(ap4);
        Apartament ap5 = new Apartament("Familia Tutulescu", 5);
        etajul1.addApartamente(ap5);
        bloc.addEtaj(etajul1);
        System.out.println();
        bloc.cautaEtaj(1);
        etajul1.afiseaza();
        System.out.println();
        bloc.cautaEtaj(0);
        etajul0.afiseaza();

    }
}
