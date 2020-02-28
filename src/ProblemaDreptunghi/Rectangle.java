package ProblemaDreptunghi;

public class Rectangle {
    private int lungime = 1;
    private int latime = 1;

    public Rectangle() {
        this.lungime = lungime;
        this.latime = latime;
    }

    public Rectangle(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public int getArea() {
int aria = this.latime*this.latime;
return aria;

    } public int  getPerimeter (){
        int perimetru=this.lungime*2+this.latime*2;
        return perimetru;
    }
}

