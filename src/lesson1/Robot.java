package lesson1;

public class Robot implements Runnable, Jumpable, Barrier {
    private String name;
    private int jumpHeight;
    private int runTime;

    public Robot(String name, int jumpHeight, int runTime) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runTime = runTime;
    }

    @Override
    public void jump() {
        System.out.println("robot " + name + " jump!");
    }

    @Override
    public void run() {
        System.out.println("robot " + name + " run!");
    }


    @Override
    public void onlyRun() {
        if (runTime > 5) {
            System.out.println("Робот пробежал норматив");
        } else {
            System.out.println("Робот не преодолел препятствие");
        }
    }

    @Override
    public void onlyJump() {
        if (jumpHeight > 8) {
            System.out.println("Робот перепрыгнул стену");
        } else {
            System.out.println("Робот не преодолел препятствие");
        }
    }
}
