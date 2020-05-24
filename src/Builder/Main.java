package Builder;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MasaBuilder masa1 = new MasaBuilder();
        masa1.setCuloare("alb");
        masa1.setInaltime(5);
        masa1.setColturiRotunde(true);
        masa1.setLungime(8);
        masa1.setMaterial("lemn");
        masa1.setSuprafatalucioasa(false);
        masa1.setLatime(5);

        MasaBuilder masa2 = new MasaBuilder();
        masa2.setCuloare("negru");
        masa2.setInaltime(3);
        masa2.setColturiRotunde(false);
        masa2.setLungime(7);
        masa2.setMaterial("stejar");
        masa2.setSuprafatalucioasa(true);
        masa2.setLatime(6);

        MasaBuilder masa3 = new MasaBuilder();
        masa3.setCuloare("maro");
        masa3.setInaltime(4);
        masa3.setColturiRotunde(true);
        masa3.setLungime(6);
        masa3.setMaterial("fag");
        masa3.setSuprafatalucioasa(false);
        masa3.setLatime(8);
        int optiune = -1;
        while (optiune != 0) {
            System.out.println("1.Contruieste masa1");
            System.out.println("2.Contruieste masa2");
            System.out.println("3.Contruieste masa3");
            System.out.println("0.Exit");
            optiune = input.nextInt();
            input.nextLine();
            if (optiune == 1) {
                MasaBuilder.Masa masa = masa1.build();
                System.out.println("Am contruit o masa " + masa);
            }
            if (optiune == 2) {
                MasaBuilder.Masa masa = masa2.build();
                System.out.println("Am contruit o masa " + masa);
            }
            if (optiune == 3) {
                MasaBuilder.Masa masa = masa3.build();
                System.out.println("Am contruit o masa " + masa);
            }
        }
    }
}
