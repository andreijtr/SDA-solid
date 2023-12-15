package liskov_substitution.good;

public class Dreptunghi extends FormaGeometrica {
    public int latime;
    public int lungime;

    public Dreptunghi(int latime, int lungime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    public int calculeazaAria() {
        return latime * lungime;
    }

    @Override
    public String toString() {
        return "Dreptunghi{" +
                "latime=" + latime +
                ", lungime=" + lungime +
                '}';
    }
}
