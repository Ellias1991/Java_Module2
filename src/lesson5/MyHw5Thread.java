package lesson5;

import java.util.Arrays;

public class MyHw5Thread {

    private static int HALF;

    public static void main(String[] args) {
        MethodOne();
        MethodTwo();
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

    }

    public static void MethodTwo() {
        float[] MajorArray = {5.0f, 4.0f, 3.0f, 2.0f, 1.0f, 8.0f};
        System.out.println(Arrays.toString(MajorArray));

        long startTime = System.currentTimeMillis();
        float[] LeftSize = new float[3];
        float[] RightSize = new float[3];
        System.arraycopy(MajorArray, 0, LeftSize, 0, 3);
        System.arraycopy(MajorArray, 3, RightSize, 0, 3);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < LeftSize.length; i++) {
                LeftSize[i] = (float) (LeftSize[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < RightSize.length; i++) {
                RightSize[i] = (float) (RightSize[i] * Math.sin(0.2f + (i + 3) / 5) * Math.cos(0.2f + (i + 3) / 5) * Math.cos(0.4f + (i + 3) / 2));
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();

            System.arraycopy(LeftSize, 0, MajorArray, 0, 3);
            System.arraycopy(RightSize, 0, MajorArray, 0, 3);
            long endTime = System.currentTimeMillis();
            System.out.println("MethodTwo execution time:" + (System.currentTimeMillis() - startTime) + " ms.");
        }
    }
}


