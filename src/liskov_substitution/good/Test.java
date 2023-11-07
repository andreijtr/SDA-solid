package liskov_substitution.good;

public class Test {
    public static void main(String[] args) {
        FormaGeometrica[] formeGeometrice = new FormaGeometrica[2];

        Dreptunghi dreptunghi = new Dreptunghi(5, 6);
        Patrat patrat = new Patrat(10);

        formeGeometrice[0] = dreptunghi;
        formeGeometrice[1] = patrat;

        for (int i = 0; i < formeGeometrice.length; i++) {
            int aria = formeGeometrice[i].calculeazaAria();
            System.out.println(aria);
        }
    }
}
