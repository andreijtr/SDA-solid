package liskov_substitution.bad;

public class Patrat extends Dreptunghi {

    public Patrat(int latura) {
        latime = latura;
        lungime = latura;
    }

    @Override
    public String toString() {
        return "Patrat{" +
                "latime=" + latime +
                ", lungime=" + lungime +
                '}';
    }
}
