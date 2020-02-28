package ProblemaTelevizor;

public class TV {
    private int canal;
    private int volum;


    public TV(int canal, int volum) {
        this.canal = canal;
        this.volum = volum;

    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;

    }

    public void maresteVolum() {
        if (this.volum < 50) {
            this.volum = volum + 1;
        }
    }

    public void micsoareVolum() {
        if (this.volum > 0) {
            this.volum = volum - 1;
        }
    }

    public void maresteCanal() {
        if (this.canal < 100) {
            this.canal = canal + 1;
        } else if(this.canal==100){
            this.canal=1;
        }

    }

    public void micsoreazaCanal() {
        if (this.canal > 1) {
            this.canal = canal - 1;
        }
        else if(this.canal==1){
            this.canal=100;
        }
    }

        }

