public class Main {

    public static int sum (int a, int b) {
        return a + b;
    }

    public static void printName () {
        System.out.println("Ali");
    }

    public static void main (String[] args) {
        System.out.println(sum(1,4));
        printName();
        Ogla smallOgla =
                new Ogla("Ogla son of Bogla",
                        "Mid-White-Black-Asian-Arab",
                        "Thinking in Java!",
                        "Brown-ish",
                        false,
                        80,
                        120.5);
        System.out.println(smallOgla.think());
        smallOgla.invokeSleeping();
        System.out.println(smallOgla.think());


        BMW c301 = new BMW();
        c301.startEngine();
        c301.shiftGear();
        c301.shutdownEngine();

        System.out.println("----------------------------");

        Toyta h100 = new Toyta();
        h100.startEngine();
        h100.shiftGear();
        h100.shutdownEngine();

        System.out.println("---------------------------");

        Ford focus = new Ford();
        focus.startEngine();
        focus.shiftGear();
        focus.shutdownEngine();

        System.out.println("-------------------------");

        Database.getDB().printAllUserRecords();
        Database.getDB().shutDownDB();

        System.out.println("-------------------------");

        Dell inspiron5100 = new Dell();
        inspiron5100.boot();
        inspiron5100.openProgram();
        inspiron5100.shutdown();

        System.out.println("-------------------------");
        Asus rog501 = new Asus();
        rog501.boot();
        rog501.restart();
        rog501.openProgram();
        rog501.shutdown();


    }



}
