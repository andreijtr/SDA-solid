package liskov_substitution.bad;

public class Dreptunghi {
    public int latime;
    public int lungime;

    public Dreptunghi(int latime, int lungime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    public Dreptunghi() {
    }

    public int calculeazaAria() {
        return latime * lungime;
    }
}
