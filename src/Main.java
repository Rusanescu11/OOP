public class Main {
    public static void main(String[] args) {
        User user = new User("Rusanescu", "Lavinia"); //User=numele clasei(schitei)
        user.merge();

        System.out.println(" ");

        user.spune(" Hello");
        int rezultatSuma =user.calculeazaSuma(2,3);
       int lenght= user.getNumeLenght();
        System.out.println("Dimensiunea este :" +lenght);
        System.out.println(user.nume);
        System.out.println("Dupa schimbare :"+user.nume);
    }



}
