public class Produs {
    //proiectati un produs cu nume descriere pret;
    //    //proiectati o clasa Cos;
    //    //clasa cos are o metoda prin care calculeaza suma totala a produselor primite ca si parametri

    //MAIN
    //creati 2 produse cu preturi diferite
    //creati un arrayslist<produs>
    //adaugati cele 2 produse in arrayslistul de produse
    //creati obiectul cos
    //apelati metoda, calculeaza din cos cu lista de produse ca si parametru
    private String nume;
    private String descriere;
    private double pret;


        public Produs(String nume, String descriere, double pret) {
            this.nume = nume;
            this.descriere = descriere;
            this.pret = pret;
        }
        public String getNume() {
            return nume;
        }
        public String getDescriere() {
            return descriere;
        }
        public double getPret() {
            return pret;
        }
        public void setNume(String nume) {
            this.nume = nume;
        }
        public void setDescriere(String descriere) {
            this.descriere = descriere;
        }
        public void setPret(int pret) {
            this.pret = pret;
        }
    }
