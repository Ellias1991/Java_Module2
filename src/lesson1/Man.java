package lesson1;

public class Man implements Runnable,Jumpable {
    private String name;

    public Man (String name){
        this.name=name;
    }

    @Override
    public void jump() {
        System.out.println("man "+ name +" jump!");
    }

    @Override
    public void run() {
        System.out.println("man "+ name +" run!");
    }
}
