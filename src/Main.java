import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] easyNumbers = {1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        int[] myMassive = {1,2,3,4,5,};
    }

    public static void task2() {
        System.out.println("Задача 2 ");
        int[] easyNumbers = {1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        int[] myMassive = {1,2,3,4,5};
        System.out.println(Arrays.toString(easyNumbers));
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(myMassive));
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] easyNumbers = {1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        int[] myMassive = {1,2,3,4,5};
        for (int i = easyNumbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(easyNumbers[i] + ",");
            } else {
                System.out.println(easyNumbers[i]);
            }
        }
        for (int r = myMassive.length - 1; r >= 0; r--) {
            if (r != 0) {
                System.out.print(myMassive[r] + ",");
            } else {
                System.out.print(myMassive[r]);
            }
        }
        System.out.println(" ");
        for (int t = doubles.length - 1; t >= 0; t--) {
            if (t != 0) {
                System.out.print(doubles[t] + ",");
            } else {
                System.out.println(doubles[t]);
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] easyNumbers = {1, 2, 3};
        for (int i = 0; i < easyNumbers.length; i++) {
            if (easyNumbers[i] % 2 != 0) {
                easyNumbers[i]= easyNumbers[i]+1;
            }
        }
        System.out.println(Arrays.toString(easyNumbers));
    }
}



