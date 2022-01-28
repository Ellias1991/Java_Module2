package lesson1;

public class Cat implements Runnable, Jumpable, Barrier,JumpersAndRunners {
    private String name;
    private int jumpHeight;
    private int runTime;

    public Cat(String name, int jumpHeight, int runTime) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runTime = runTime;
    }

    @Override
    public void run() {
        System.out.println("cat " + name + " run!");
    }

    @Override
    public void jump() {
        System.out.println("cat " + name + " jump!");
    }


    @Override
    public void onlyRun() {
        if (runTime > 5) {
            System.out.println("Кот пробежал норматив");
        } else {
            System.out.println("Кот не преодолел препятствие");
        }
    }


    @Override
    public void onlyJump() {
        if (jumpHeight > 8) {
            System.out.println("Кот перепрыгнул стену");
        } else {
            System.out.println("Кот не преодолел препятствие");
        }
    }
}
