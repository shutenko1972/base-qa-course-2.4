public class ForIfBreak {

//   Операторы перехода

//    for (int i = 0; i < 15; i++){
//        if (i > 10)
//            break;
//        System.out.println(i);
//    }
//
//        for (int i = 0; i < 15; i++) {
//            if ((i > 8) && (i < 11))
//                continue;
//            System.out.println(i);
//        }

    public static void main(String[] args) {

//        Задача №10
//        Дано натуральное число.
//        1. Определить его максимальную цифру
//        2. Определить его минимальную цифру

        int number = 58914950;
        int max = 0;
        int min = 9;

        do {
            int digit = number % 10;
            number = number / 10;

            if (digit > max) {
                max = digit;
                if (max == 9) {
                   continue;
                }
            }

            if (digit < min) {
                min = digit;
                if (min == 0) {
                    continue;
                }

            }
        }
        while (number > 0);

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
  }



