package lesson2;

public class Main {
    public static void main(String[] args) {

        try {
            String[][] strings = {
                    {"1", "2", "3", "2"},
                    {"1", "5", "7", "64"},
                    {"1", "2", "38", "2"},
                    {"9", "5", "4", "78"},
                    {"18", "2", "16", "2"},
            };
            strings[5][5] = "12";
            strings[5][6]="13";
            throw new MyArraySizeException();
        } catch (MyArraySizeException e) {

        }
    }
}


