package ProblemaTelevizor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
TV tv =new TV(99,50);
        System.out.println(("Canal:"+ tv.getCanal()+ ","+"Volum:"+tv.getVolum()));
        System.out.println("Alegeti ON sau OFF");
        String a="ON";
        while(!a.equals("OFF")){
            System.out.println("1.Schimbare canal");
            System.out.println("-.Micsorare volum");
            System.out.println("+.Marire volum");
            a=input.nextLine();
if(a.equals("1")) {
    System.out.println("Schimba canalul");
}
else if(a.equals("p+")) {
    tv.maresteCanal();
    System.out.println("Canal:" + tv.getCanal() + " Volum:" + tv.getVolum());
}
else if (a.equals("p-") ){
    tv.micsoreazaCanal();
    System.out.println("Canal:" + tv.getCanal() + " Volum:" + tv.getVolum());

} else if(tv.getCanal()==100){
    tv.setCanal(1);
    System.out.println("Canal:" + tv.getCanal() + " Volum:" + tv.getVolum());
}

else if(a.equals("+")){
    tv.maresteVolum();
    System.out.println("Canal:"+ tv.getCanal()+" Volum:"+tv.getVolum());

} else if(a.equals("-")){
    tv.micsoareVolum();
    System.out.println("Canal:"+ tv.getCanal()+" Volum:"+tv.getVolum());
}
        }
}

    }

