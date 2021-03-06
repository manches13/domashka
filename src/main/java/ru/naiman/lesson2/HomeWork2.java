package ru.naiman.lesson2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
//        Задание 1
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        System.out.println("\nЗадание 1");

        System.out.println("Было " + Arrays.toString(arr));
        System.out.println("Стало " + methodСhangingAnArray(arr));

//        Задание 2
        System.out.println("\nЗадание 2");

        int massive[] = new int[8];
        methodSetArray(massive);

//        Задание 3
        System.out.println("\nЗадание 3");

        int massive3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        methodSetIncrement(massive3);

//        Задание 4
        System.out.println("\nЗадание 4");
        byte[][] Array2d = new byte[6][6];

        methodSetDiagonal(Array2d);

//        Задание 5
        System.out.println("\nЗадание 5");
        int[] massive4 = {2, 2, 3, 8, 5, 6, 1};
        methodMinMax(massive4);

//        Задание 6
        System.out.println("\nЗадание 6");
        int[] massive5 = {2, 2, 2, 1, 2, 2, 10, 1};

        System.out.println(methodCheckBalance(massive5));

//        Задание 7
        System.out.println("\nЗадание 7");
        int[] massive6 = {1, 2, 3, 4, 5, 6};
        methodShift(massive6, 2);
    }





    //   Задание  1
   public static String methodСhangingAnArray(int[] arr){
        for (int i=0; i < arr.length; i++ ){
            if ( arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        return Arrays.toString(arr) ;
   }

    //   Задание  2
   public static void methodSetArray(int[] massive) {
//       0 3 6 9 12 15 18 21
//     int[] massive = {0, 0, 0, 0, 0, 0, 0, 0};
       int[] arr = {0, 3, 6, 9, 12, 15, 18, 21};

       System.out.println("Было " + Arrays.toString(massive));

       for(int i = 0; i < massive.length; i++) {
           massive[i] = arr[i];
       }

       System.out.println("Стало " + Arrays.toString(massive));
   }

//   Задание  3
// [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]
    public static void methodSetIncrement(int[] massive) {
        System.out.println("Было " + Arrays.toString(massive));
        for(int i = 0; i < massive.length; i++) {
            if(massive[i] < 6) {
                massive[i] = massive[i] * 2;
            }
        }

        System.out.println("Стало " + Arrays.toString(massive));
    }

//    Задание 4
    public static void methodSetDiagonal(byte[][] massive) {
        for(int i = 0; i < massive.length; i ++) {
            for(int j = 0; j < massive[i].length; j++) {
                if(i == j){
                    massive[i][j] = 1;
                }
            }
        }

        print2d(massive);
    }
//    Распечатка 2d масива
    public static void print2d(byte[][] massive) {
        for(int i = 0; i < massive.length; i ++) {
            for(int j = 0; j < massive[i].length; j++) {
                System.out.printf("%5d ", massive[i][j]);
            }
            System.out.printf("\n");
        }
    }

//    Задание 5
    public static void methodMinMax(int[] massive) {
        int minIndex = 0;
        int maxIndex = 0;
        
        for(int i = 0; i < massive.length; i++) {
//            Если индекс минимального числа в массиве меньше текущего значение  то запишем его индекс в minIndex
            if (massive[i] < massive[minIndex]) {
                minIndex = i;

            } else if (massive[i] > massive[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Минимальное значение " + massive[minIndex] + "\n");
        System.out.println("Максимальное значение " + massive[maxIndex] + "\n");
    }

//    Задание 6
        public static boolean methodCheckBalance(int[] massive) {
            int sum = 0;
            for (int i = 0; i < massive.length; i++) {
                sum += massive[i];
            }
//           Если сумма всех чисел не делится без остатка тогда false
            if (sum % 2 != 0) return false;
//            Делим сумму пополам
            sum /= 2;
            int left = 0;

            for (int i : massive) {
                left += i;
                if (left == sum) return true;
                if (left > sum) return false;
            }

            return false;

        }


//    Задание 7
    static void methodShift (int[] massive, int n) {
//        Сколько раз двигаться
        int shift = (massive.length + n % massive.length) % massive.length;
//
        for(int i = 0; i < shift; i++) {
            int temp = massive[massive.length - 1];

            for (int j = massive.length - 1; j > 0; j--) {
                massive[j] = massive[j - 1];
            }
            massive[0] = temp;
        }

        System.out.println(Arrays.toString(massive));
    }
}

