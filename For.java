import java.util.Scanner;

public class For {

    //Задача №1
    //Напечатать ряд чисел 20 в виде:
    //20 20 20 20 20 20 20 20 20 20.

    //public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) { //i = i + 1
//            System.out.print("20 ");
//      }

//        Задача №2
//        Напечатать числа следующим образом:
//        10 10.4
//        11 11.4
//...
//        25 25.4

//    public static void main(String[] args) {
//        for (int i = 10; i < 26; i++) {
//            System.out.print(i + " " + i + ".4");
//            System.out.println();
//        }

//    Задача №3
//    Напечатать таблицу умножения на 7:
//            1 х 7 = 7
//            2 х 7 = 14
//            ...
//            9 х 7 = 63

//    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++){
//            System.out.printf("%d x 7 = %d\n", i, i*7);
//        }

//    Задача №4
//    Найти:
//            1. сумму всех целых чисел от 100 до 500;
//2. сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>a).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        sum(a, b);
    }

    public static void sum(int a, int b) {
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }
}



