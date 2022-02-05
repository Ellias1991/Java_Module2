package lesson2;

public class MyArrayDataException extends ArrayStoreException {

    public static void main(String[] args) {

        try {
            String[][] arr = new String[][]{
                    {"1", "2", "3", "2"},
                    {"1", "5", "7", "64"},
                    {"1", "2q", "38", "2"},
                    {"9", "5", "4", "78"},
            };

            int[][] arr1 = new int[4][4];
            int sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    arr1[i][j] = Integer.parseInt(arr[i][j]);
                    sum += arr1[i][j];

                }
                throw new MyArrayDataException();
            }
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}