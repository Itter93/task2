import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        int[] array = new int[] {2,89,78,678,4,-456,-3,67,-899,561,45,89,-92,-56,77,-128,-765,934,7,90,0,-100,333,-98,1,666,901,-38,12,80};
        for (int i = 0; i < 30; i++) {
            System.out.print(array[i] + ", "); // вывод массива
        }
        System.out.println();

        for (int j = 0; j < array.length; j++) {
            if (array[j] < 10 && array[j] > 0) {
                int fact = 1;
                for (int i = 1; i <= array[j]; i++)
                    fact = fact * i;
                System.out.print(fact + ", ");
            }
        } // факториал однозначных чисел
        System.out.println();

        for (int j = 0; j < array.length; j++) {
            if ((array[j] > 9 && array[j] < 100) || (array[j] < -9 && array [j] > -100)) {
                if (array[j] % 2 == 0)
                    array[j] = array[j] / 2;
                else
                    array[j] = array[j] * 3;
                System.out.print(array[j] + ", ");
            }
        } // двузначные числа
        System.out.println();

        int max = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 99 && (j % 2) != 0 && max < array[j])
                max = array[j];
        }
        System.out.print(max); // максимальное трехзначное число
        System.out.println();

        int min = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < -99 && (j % 2) == 0 && min > array[j])
                min = array[j];
        }
        System.out.print(min); // минимальное трехзначное число
    }
}



