import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        homeWork1();
        homeWork2();
        homeWork3();
        homeWork4();

    }

    public static void homeWork1() {
        int[] massivInt = new int[]{1, 2, 3};
        double[] massivDouble = {1.57, 7.654, 9.986};
        boolean[] massivBool = {true, false, true};
    }

    public static void homeWork2() {

        Integer[] massivInt = new Integer[]{1, 2, 3};
        Double[] massivDouble = {1.57, 7.654, 9.986};
        Boolean[] massivBool = {false, false, true};

        printMassivRight(massivInt);
        printMassivRight(massivDouble);
        printMassivRight(massivBool);
    }

    public static void homeWork3() {

        Integer[] massivInt = new Integer[]{1, 2, 3};
        Double[] massivDouble = {1.57, 7.654, 9.986};
        Boolean[] massivBool = {false, false, true};

        printMassivLeft(massivInt);
        printMassivLeft(massivDouble);
        printMassivLeft(massivBool);

    }

    public static void homeWork4() {

        int[] massivInt = new int[]{1, 2, 3};

        for (int i = 0; i < massivInt.length - 1; i++) {
            if (massivInt[i] % 2 != 0) massivInt[i]++;
            System.out.print(massivInt[i] + ",");
        }
        if (massivInt[massivInt.length - 1] % 2 != 0) massivInt[massivInt.length - 1]++;
        System.out.println(massivInt[massivInt.length - 1]);
    }
    public static <T> void printMassivRight(T[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static <T> void printMassivLeft(T[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[0]);
    }

}

