import java.util.ArrayList;

public class Mainprodus {
    public static void main(String[] args) {

            Produs produs1=new Produs("Tide","detergent rufe",8);
            Produs produs2=new Produs("Ariel","detergent rufe",7);
            ArrayList<Produs> listaDeProduse=new ArrayList<Produs>();
            listaDeProduse.add(produs1);
            listaDeProduse.add(produs2);
            Cos Cos =new Cos();
            double total=Cos.calculeazaSuma(listaDeProduse);
        System.out.println("pretul total"+total);
        }

    }

