package liskov_substitution.bad;

public class Test {
    public static void main(String[] args) {
        Dreptunghi[] formeGeometriceDreptunghiulare = new Dreptunghi[2];

        Dreptunghi dreptunghi = new Dreptunghi(2, 3);
        Patrat patrat = new Patrat(4);

        formeGeometriceDreptunghiulare[0] = dreptunghi;
        formeGeometriceDreptunghiulare[1] = patrat;

        for (int i = 0; i < formeGeometriceDreptunghiulare.length; i++) {
            int aria = formeGeometriceDreptunghiulare[i].calculeazaAria();
            System.out.println("aria pentru " + formeGeometriceDreptunghiulare[i] + " este " + aria);
        }
    }
}
