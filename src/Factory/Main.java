package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Factory factory = new Factory();
        int pret = -1;
        int optiune = -1;
        while (pret != 0) {
            System.out.println("Introdu buget");
            pret = input.nextInt();
            input.nextLine();
            MasaBuilder.Masa masa=factory.getMasa(pret);
            System.out.println(masa);
        }
    }
}
