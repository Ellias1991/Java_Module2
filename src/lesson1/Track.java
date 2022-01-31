package lesson1;

public class Track implements Barrier {
    private int runTime = 5;


    public Track(int runTime) {
        this.runTime = runTime;

    }

    @Override
    public void onlyRun() {

    }

    @Override
    public void onlyJump() {

    }
}
