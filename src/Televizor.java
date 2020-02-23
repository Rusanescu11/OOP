public class Televizor {
    // proiectati un tv cu volumul de la inceput 50 si canalul 0
    //pe tv putem schimba canalul
    //pe tv putem mari volumul doar cu o unitate;
    //geteri si setteri ptr canal si volum
    private int volum = 50;
    private int canal = 0;


    public Televizor() {
        canal = 0;
        volum = 50;

    }

    public int getVolum() {
        return volum;
    }

    public int getCanal() {
        return canal;
    }

    public void maresteVolum() {
        if (this.volum < 100) {

            this.volum = volum + 1;// sau putem scrie volum =volum++
        }
    }
        public void micsorareVolum(){
            if(this.volum>0){
                volum = volum - 1;
            }
        }

        public void setCanal(int canal){
            this.canal = canal;
        }

    }
