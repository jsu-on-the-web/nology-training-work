package src.ChallengeTen;

public class ChallengeTenMain {
    public static void main(String[] args) {
        LatteGlass la = new LatteGlass();
        System.out.println(la.getInfo());
        ShotGlass sh = new ShotGlass();
        System.out.println(sh.getInfo());
        Mug mu = new Mug();
        System.out.println(mu.getInfo());

        Landline lan = new Landline("123", "1 Appleseed Way");
        System.out.println(lan.getInfo());
        Mobile m1 = new Mobile("123");
        System.out.println(m1.getInfo());
        Mobile m2 = new Mobile("543");
        System.out.println(m2.getInfo());
        m1.text(m2, "Hello");
        m2.call(lan);
    }
}
