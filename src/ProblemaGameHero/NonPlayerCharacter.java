package ProblemaGameHero;

public class NonPlayerCharacter extends Players {

    private int viata;
    private int puteredeAtac;

    @Override
    public int getViata() {
        return viata;
    }

    @Override
    public void setViata(int viata) {
        this.viata = viata;
    }

    @Override
    public int getPuteredeAtac() {
        return puteredeAtac;
    }

    @Override
    public void setPuteredeAtac(int puteredeAtac) {
        this.puteredeAtac = puteredeAtac;
    }

    @Override
    public void atack(Players players) {
        System.out.println("O sa te atac");
        players.decressLife(this.puteredeAtac);
    }
        @Override
        public void decressLife(int puteredeAtac) {
            this.setViata(this.getViata()-puteredeAtac);
        }
    }

