package liskov_substitution.good;

public class Patrat extends FormaGeometrica {

    public int lungimeLatura;

    public Patrat(int lungimeLatura) {
        this.lungimeLatura = lungimeLatura;
    }

    public int calculeazaAria() {
        return lungimeLatura * lungimeLatura;
    }

    @Override
    public String toString() {
        return "Patrat{" +
                "lungimeLatura=" + lungimeLatura +
                '}';
    }
}
