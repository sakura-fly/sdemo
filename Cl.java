package testmap;

public class Cl {

    public static void main(String[] args) {

        // long start = System.currentTimeMillis();

        MSS mss = MSS.getInstance();
        MSession m = new MSession();
        // for (int i = 0; i < 1000615; i++) {
        //     mss.add(new MSession());
        // }
        MSession m2 = new MSession();
        // for (int i = 0; i < 1065100; i++) {
        //     mss.add(new MSession());
        // }
        MSession m3 = new MSession();
        // for (int i = 0; i < 156000; i++) {
        //     mss.add(new MSession());
        // }
        MSession m4 = new MSession();
        // for (int i = 0; i < 1006510; i++) {
        //     mss.add(new MSession());
        // }


        mss.add(m);
        mss.add(m2);
        mss.add(m3);
        mss.add(m4);

        // long addover = System.currentTimeMillis();
        // System.out.println("addover" + (addover - start));

        System.out.println(mss.getMs());
        // System.out.println(mss.getMs().size());

        m.dis();
        // m2.dis();
        // m3.dis();
        // m4.dis();

        // long disover = System.currentTimeMillis();
        //
        // System.out.println("disover" + (disover - start));


        System.out.println(mss.getMs());

        // System.out.println(mss.getMs().size());


    }

}
