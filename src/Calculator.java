public class Calculator {
    //proiectam o noua clasa numita calculator
    //o metoda care returneaza suma a doua numere primite
    //o metoda care returneaza diferenta a doua numere primite
    //o metoda care returneaza produsul a doua numere primite
    //o metoda care returneaza impartirea a doua numere primite

    //MAIN
    //vom crea un obiect numit calculator
    //vom cere utilizatorului sa introduca un numar;
    //vom cere utilizatorului sa introduca o operatie(+,-,*,:)
    //vom cere utilizatorului sa introduca un akl doilea nr
    //in fct de metoda aleasa vom apela metoda corespondenta din calculator si vom afisa rezultatul
    public int suma(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int diferenta(int a,int b){
        int diferenta=a-b;
        return diferenta;
    }
    public int produsul(int a,int b){
        int produsul=a*b;
        return produsul;

}
    public int impartire(int a,int b) {
        int impartirea = a/b;
        return impartirea;
    }
    }
