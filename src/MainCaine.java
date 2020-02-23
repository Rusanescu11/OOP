import java.util.ArrayList;
import java.util.concurrent.Callable;

public class MainCaine {
    public static void main(String[] args) {
        Caine caine=new Caine("Minnie");
        Caine caine1=new Caine("Minnie","alb");
        System.out.println(caine.getNume());
        caine.setNume("Lessy");
        System.out.println("Dupa schimbare :"+caine.getNume());
        ArrayList<Caine>listaDeCaini=new ArrayList<>();
        listaDeCaini.add(caine);
        listaDeCaini.add(caine1);

        //primul fel de parcurgere al listei
        for(int index=0;index<listaDeCaini.size();index++){
           Caine  cainidinLista=listaDeCaini.get(index);
           String numeCaine=cainidinLista.getNume();
            System.out.println(numeCaine);


                }
            };
        }

