package liskov_substitution.bad;

public class Patrat extends Dreptunghi {

    public int lungimeLatura;

    public Patrat(int lungimeLatura) {
        this.lungimeLatura = lungimeLatura;
        latime = lungimeLatura;
        lungime = lungimeLatura;
    }

    public int calculeazaAria() {
        return lungimeLatura * lungimeLatura;
    }
}
