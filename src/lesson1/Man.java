package lesson1;

public class Man implements Runnable, Jumpable, Barrier,JumpersAndRunners {
    private String name;
    private int jumpHeight;
    private int runTime;

    public Man(String name, int jumpHeight, int runTime) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runTime = runTime;
    }

    @Override
    public void jump() {
        System.out.println("man " + name + " jump!");
    }

    @Override
    public void run() {
        System.out.println("man " + name + " run!");
    }


    @Override
    public void onlyRun() {
        if (runTime > 5) {
            System.out.println("Человек пробежал норматив");
        } else {
            System.out.println("Человек не преодолел препятствие");
        }
    }

    @Override
    public void onlyJump() {
        if (jumpHeight > 8) {
            System.out.println("Человек перепрыгнул стену");
        } else {
            System.out.println("Человек не преодолел препятствие");
        }
    }
}
