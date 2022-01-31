package lesson1;

public class Wall implements Barrier {
    private int wallHeight = 8;


    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }


    @Override
    public void onlyRun() {

    }

    @Override
    public void onlyJump() {

    }
}
