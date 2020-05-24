package Factory;

public class Factory {
    private MasaBuilder masa1;
    private MasaBuilder masa2;
    private MasaBuilder masa3;

    public Factory() {
        masa1 = new MasaBuilder();
        masa1.setCuloare("alb");
        masa1.setInaltime(5);
        masa1.setColturiRotunde(true);
        masa1.setLungime(8);
        masa1.setMaterial("lemn");
        masa1.setSuprafatalucioasa(false);
        masa1.setLatime(5);
        masa1.setPret(400);


        masa2 = new MasaBuilder();
        masa2.setCuloare("negru");
        masa2.setInaltime(3);
        masa2.setColturiRotunde(false);
        masa2.setLungime(7);
        masa2.setMaterial("stejar");
        masa2.setSuprafatalucioasa(true);
        masa2.setLatime(6);
        masa2.setPret(300);


        masa3 = new MasaBuilder();
        masa3.setCuloare("maro");
        masa3.setInaltime(4);
        masa3.setColturiRotunde(true);
        masa3.setLungime(6);
        masa3.setMaterial("fag");
        masa3.setSuprafatalucioasa(false);
        masa3.setLatime(8);
        masa3.setPret(700);
    }

    public MasaBuilder.Masa getMasa(int pret) {
        MasaBuilder.Masa masa = null;
        if (pret >=400 && pret<= 600) {
            masa = masa1.build();
        }
        if (pret >300 &&pret<= 400) {
            masa = masa2.build();
        }
        if (pret >700 &&pret<= 800) {
            masa = masa3.build();
        }
        return masa;
    }

}
