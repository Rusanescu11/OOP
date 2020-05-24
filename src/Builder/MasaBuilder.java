package Builder;

public class MasaBuilder {
    private String culoare;
    private String material;
    private boolean suprafatalucioasa;
    private int latime;
    private int inaltime;
    private boolean colturiRotunde;
    private int lungime;

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSuprafatalucioasa(boolean suprafatalucioasa) {
        this.suprafatalucioasa = suprafatalucioasa;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }


    public void setColturiRotunde(boolean colturiRotunde) {
        this.colturiRotunde = colturiRotunde;
    }

    public Masa build() {
        if (inaltime == 0) {
            throw new RuntimeException("No inaltime set");

        }
        if (lungime == 0) {
            throw new RuntimeException("No lungime set");
        }
        if (latime == 0) {
            throw new RuntimeException("No latime set");
        }
        if (culoare == null) {
            throw new RuntimeException("No culoare set");
        }
        if (material == null) {
            throw new RuntimeException("No material set");
        }
        Masa masa = new Masa();
        masa.setColturiRotunde(colturiRotunde);
        masa.setCuloare(culoare);
        masa.setInaltime(inaltime);
        masa.setLatime(latime);
        masa.setMaterial(material);
        masa.setLungime(lungime);
        masa.setSuprafatalucioasa(suprafatalucioasa);
        return masa;
    }

    public class Masa {
        private String culoare;
        private String material;
        private boolean suprafatalucioasa;
        private int latime;
        private int inaltime;
        private boolean colturiRotunde;
        private int lungime;

        public String getCuloare() {
            return culoare;
        }

        public void setCuloare(String culoare) {
            this.culoare = culoare;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public boolean isSuprafatalucioasa() {
            return suprafatalucioasa;
        }

        public void setSuprafatalucioasa(boolean suprafatalucioasa) {
            this.suprafatalucioasa = suprafatalucioasa;
        }

        public int getLatime() {
            return latime;
        }

        public void setLatime(int latime) {
            this.latime = latime;
        }

        public boolean isColturiRotunde() {
            return colturiRotunde;
        }

        public void setColturiRotunde(boolean colturiRotunde) {
            this.colturiRotunde = colturiRotunde;
        }

        public int getInaltime() {
            return inaltime;
        }

        public void setInaltime(int inaltime) {
            this.inaltime = inaltime;
        }

        public int getLungime() {
            return lungime;
        }

        public void setLungime(int lungime) {
            this.lungime = lungime;
        }

        @Override
        public String toString() {
            return "Masa{" +
                    "culoare='" + culoare + '\'' +
                    ", material='" + material + '\'' +
                    ", suprafatalucioasa=" + suprafatalucioasa +
                    ", latime=" + latime +
                    ", inaltime=" + inaltime +
                    ", colturiRotunde=" + colturiRotunde +
                    ", lungime=" + lungime +
                    '}';
        }
    }
}

