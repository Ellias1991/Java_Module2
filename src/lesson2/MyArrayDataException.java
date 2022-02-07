package lesson2;

public class MyArrayDataException extends RuntimeException {
private int rowI;
private int colJ;

    public int getRowI() {
        return rowI;
    }

    public int getColJ() {
        return colJ;
    }
public MyArrayDataException(String message,int rowI, int colJ){
        super (message);
        this.rowI=rowI;
        this.colJ=colJ;
}
    public static void main(String[] args) {

        try {
            String[][] arr = new String[][]{
                    {"1", "2", "3", "2"},
                    {"1", "5", "7", "64"},
                    {"1", "2", "38", "2"},
                    {"9", "5", "4", "78"},
            };

            int[][] arr1 = new int[4][4];
            int sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    arr1[i][j] = Integer.parseInt(arr[i][j]);
                    sum += arr1[i][j];
                    System.out.println(sum);
                }

            }
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}