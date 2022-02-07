package lesson2;

public class Main {
    static int LENGTH = 4;

    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "2", "3", "2"},
                {"1", "5q", "7", "64"},
                {"1", "2", "38", "2"},
                {"9", "5", "4", "78"},
        };
        try {
            System.out.println(sum(arr));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getRowI() + " " + e.getColJ());
            System.out.println(arr[e.getRowI()][e.getColJ()]);
        }
    }

    static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != LENGTH) {
            throw new MyArraySizeException();

        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("format " + i + " " + j, i, j);
                }

            }
        }
        return sum;
    }
}











