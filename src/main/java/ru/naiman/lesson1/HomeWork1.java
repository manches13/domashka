package ru.naiman.lesson1;
// int - Целлочисленный тип данных, целые числа 1 2  3 4 9 20 100
// double - Типы с плавающей точкой — float и double. Они служат для представления чисел, имеющих дробную часть. 1.11 50.13 7.01
public class HomeWork1 {
    public static void main(String[] args) {
       System.out.print(methodComp(2,3,4,5));

       System.out.print("\n");

       System.out.print(methodCheck(2,7));

       methodPositiveNumber(13);

       methodHelloMessage("Александр");

       System.out.print("\n");

       methodLeapYear(2300);
    }

    // Вычисляем выражение
    public static double methodComp(double a, double b, double c, double d) {
        return  a * (b + (c / d));
    }

    // Проверяем числа
    public static boolean methodCheck(int a, int b) {
        int c = a+b;

        //Если c больше или равно 10 и меньше или равно 20 тогда true
        if (c >= 10 && c <= 20 ) {
            return true;
        }

        return false;
    }

    // Проверка положительных и отрицательных чисел .
    public static void methodPositiveNumber(int a) {
        if (a < 0) {
            System.out.print("\nОтрицательное число\n");
        } else {
            System.out.print("\nПоложительное число\n");
        }
    }

    // Приветствие.
    public static void methodHelloMessage(String name ) {
        System.out.print("Привет " + name );
    }

    // Проверка года на високосность
    public static void methodLeapYear(int year) {
        int a = year % 4;
        int b = year % 100;
        int c = year % 400;

        if (a != 0  ){
            System.out.print("Год не високосный\n");
        } else if (b != 0){
            System.out.print("Год не високосный\n");
        } else if (c != 0){
            System.out.print("Год не високосный\n");
        } else {
            System.out.print("Год високосный\n");
        }


    }
}
