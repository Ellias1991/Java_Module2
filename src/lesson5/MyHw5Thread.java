package lesson5;

import java.util.Arrays;

public class MyHw5Thread {

    private static int HALF;

    public static void main(String[] args) {
        MethodOne();
    }

    public static void MethodOne() {
        final int SIZE = 10_000_000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("MethodOne execution time: " + (System.currentTimeMillis() - startTime) + " ms.");
        System.out.println(arr[HALF]);
    }

    public static void MethodTwo() {
        float[] MajorArray = {5.0f, 4.0f, 3.0f, 2.0f, 1.0f, 8.0f};
        System.out.println(Arrays.toString(MajorArray));

        long startTime = System.currentTimeMillis();
        float[] leftSide = new float[3];
        float[] RightSide = new float[3];
        System.arraycopy(MajorArray, 0, leftSide, 0, 3);
        System.arraycopy(MajorArray, 3, RightSide, 0, 3);

    }
}


