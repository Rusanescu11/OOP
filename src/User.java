public class User {
    public String nume;   //membrii clasei
    private String prenume;
    private int varsta;

    public User(String nume, String prenume) { //constructor
        this.nume = nume;
        this.prenume = prenume;

    }

    public User(String nume, String prenume, int varsta) { //constructor
        this.nume = nume;
        this.prenume = prenume;
        this.varsta=varsta;
    }
    public void merge() { //void =nu returneaza nimic,doar printeaza pe ecran
        System.out.println("Utilizatorul merge");
    }
    public void spune(String cuvant){
        System.out.println("Spune "+cuvant);

    }
    public int calculeazaSuma(int num1,int num2){
        int rezultat=num1+num2;
        return rezultat;
    }
    public int getNumeLenght(){
        return this.nume.length();
    }
    public void setNume(String noulNume ){
        this.nume=noulNume;
    }
}
