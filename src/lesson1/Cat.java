package lesson1;

public class Cat implements Runnable,Jumpable{
    private String name;

    public Cat (String name) {
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println("cat "+ name +" run!");
    }

    @Override
    public void jump() {
        System.out.println("cat "+ name +" jump!");
    }
}
