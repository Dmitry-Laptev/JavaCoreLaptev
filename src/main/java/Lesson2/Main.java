package Lesson2;

public class Main {
    public static void main(String[] args) {

        String[][] a;
        a = new String[][]{{"1", "2", "3", "4"},
                {"2", "3", "4", "5"}
        };

        int sumA = 0;

        try {
            newMethod1(a);
        } catch (MyArraySizeExceptions e) {
            throw new RuntimeException(e);
        }


        try {
            sumArray(???, sumA);
        } catch (MyArrayDataException e) {
            throw new RuntimeException(e);
        }
    }

    public static void newMethod1(String[][] a) throws MyArraySizeExceptions {
        if (a.length != 4 && a[1].length != 4) {
            throw new MyArraySizeExceptions("Размер массива не = 4");
        }
    }

    public static void sumArray(String a, int sumA) throws MyArrayDataException{
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                int x = Integer.parseInt(a[i][j]);
                sumA = sumA + x;
            }
        }
        System.out.println(sumA);
    }


}
