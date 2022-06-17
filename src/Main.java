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

        PrintMassive printMassive = new PrintMassive();

        Integer[] massivInt = new Integer[]{1, 2, 3};
        Double[] massivDouble = {1.57, 7.654, 9.986};
        Boolean[] massivBool = {false, false, true};

        printMassive.<Integer>printMassivRight(massivInt);
        printMassive.<Double>printMassivRight(massivDouble);
        printMassive.<Boolean>printMassivRight(massivBool);
    }

    public static void homeWork3() {

        PrintMassive printMassive = new PrintMassive();

        Integer[] massivInt = new Integer[]{1, 2, 3};
        Double[] massivDouble = {1.57, 7.654, 9.986};
        Boolean[] massivBool = {false, false, true};

        printMassive.<Integer>printMassivLeft(massivInt);
        printMassive.<Double>printMassivLeft(massivDouble);
        printMassive.<Boolean>printMassivLeft(massivBool);

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


}
class PrintMassive {

    public <type> void printMassivRight(type[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public <type> void printMassivLeft(type[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[0]);
    }
}
