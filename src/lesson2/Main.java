package lesson2;

public class Main {
    public static void main(String[] args) {

        try {
            String[][] arr = new String[][]{
                    {"1", "2", "3", "2"},
                    {"1", "5", "7", "64"},
                    {"1", "2", "38", "2"},
                    {"9", "5", "4", "78"},
            };
            int[][] arr1 = new int[4][4];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {

                    arr1[i][j] = Integer.parseInt(arr[i][j]);
                    System.out.println(arr1[i][j]);
                }

            }

            arr[5][5] = "12";
            arr[5][6] = "13";
            throw new MyArraySizeException();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }
}

