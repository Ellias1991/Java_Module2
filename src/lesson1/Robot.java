package lesson1;

public class Robot implements Runnable,Jumpable {
    private String name;

    public Robot (String name){
        this.name=name;
    }

    @Override
    public void jump() {
        System.out.println("robot "+ name +" jump!");
    }

    @Override
    public void run() {
        System.out.println("robot "+ name +" run!");
    }
}
