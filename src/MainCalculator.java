import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Calculator a=new Calculator();

        System.out.println("Introdu o operatie");
      String operatie=input.nextLine();
        System.out.println("Introdu cele 2 numere");
        if(operatie.equals("+")) {
            int x = a.suma(input.nextInt(), input.nextInt());
            System.out.println(x);
        }  else if(operatie.equals("-")) {
            int x = a.diferenta(input.nextInt(), input.nextInt());
            System.out.println(x);
        }else if(operatie.equals("*")) {
            int x = a.produsul(input.nextInt(), input.nextInt());
            System.out.println(x);
        }else if(operatie.equals("/")){
            int x = a.impartire(input.nextInt(), input.nextInt());
            System.out.println(x);

    }


    }
}
