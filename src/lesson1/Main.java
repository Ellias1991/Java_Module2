package lesson1;

public class Main {
    public static void main(String[] args) {
        Runnable[] runnables = new Runnable[]{
                new Cat("Murzik", 5, 8),
                new Man("Vasily", 9, 15),
                new Robot("Vitaly", 10, 100)

        };
        for (int i = 0; i < runnables.length; i++) {
            runnables[i].run();

        }
        Jumpable[] jumpables = new Jumpable[]{
                new Cat("Murzik", 5, 8),
                new Man("Vasily", 8, 15),
                new Robot("Vitaly", 10, 100)

        };
        for (int i = 0; i < jumpables.length; i++) {
            jumpables[i].jump();
        }
        Barrier[] barriers = new Barrier[]{
                new Track(5),
                new Wall(10),
        };
        Cat[] cats = new Cat[]{
                new Cat("Barsik", 6, 7),
                new Cat("Murzik", 5, 8),
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].onlyJump();
            cats[i].onlyRun();
        }
        Man[] men = new Man[]{
                new Man("Vasily", 10, 10),
                new Man("Petr", 7, 4),
        };
        for (int i = 0; i < men.length; i++) {
            men[i].onlyJump();
            men[i].onlyRun();
        }
        Robot[] robots = new Robot[]{
                new Robot("Vitaly", 15, 10),
                new Robot("Victor", 7, 15),
        };
        for (int i = 0; i < robots.length; i++) {
            robots[i].onlyJump();
            robots[i].onlyRun();
        }
    }

}








