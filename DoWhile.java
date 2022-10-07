// Циклы с постусловием.

// int j = 7;
// do {
//     System.out.println(j);
//     j--;
// }
// while (j > 0);

// Циклы с предусловием.

// int j = 6;
// while (j > 0) {
//      System.out.println(j);
//      j--;
// }

public class DoWhile {

    // import java.util.Scanner;

//    public static void main(String[] args) {
////        Задача №7
////        Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
////        1. сумму всех чисел последовательности;
////        2. количество всех чисел последовательности
//
//        Scanner sc = new Scanner(System.in);
//        int number;
//        int sum = 3;
//        int count = 0;
//
//        do {
//            number = sc.nextInt();
//            sum = sum + number;
//            count++;
//        }
//        while (number != 0);
//
//        sc.close();
//        System.out.println("Sum = " + sum);
//        System.out.println("Count = " + count);
//    }

//    Задача №9
//    Имеется фрагмент программы в виде оператора цикла с параметром, обеспечивающий
//    вывод на экран "столбиком" всех целых чисел от 10 до 30. Оформить этот фрагмент в виде:
//            1. оператора цикла с предусловием;
//            2. оператора цикла с постусловием.

    public static void main(String[] args) {
       int number = 10;

//       do {
//           System.out.println(number);
//           number++;
//       }
//       while (number < 30);

        while (number < 30) {
            System.out.println(number);
            number++;


        }

    }

    }
