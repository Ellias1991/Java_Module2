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
        JumpersAndRunners[] jumpersAndRunners = new JumpersAndRunners[]{
                new Cat("Murzik", 5, 8),
                new Man("Vasily", 8, 15),
                new Robot("Vitaly", 10, 100)
        };
        for (int i = 0; i < jumpersAndRunners.length; i++) {
            jumpersAndRunners[i].onlyJump();
            jumpersAndRunners[i].onlyRun();

        }
    }
}







