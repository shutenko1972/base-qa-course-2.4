public class Task5 {

//    Задача №3 (2)
//    Напечатать полную таблицу сложения в виде:
//            1 + 1 = 2 1 + 2 = 3 ... 1 + 9 = 10
//            2 + 1 = 3 2 + 2 = 4 ... 2 + 9 = 11
//            ...
//            9 + 1 = 10 9 + 2 = 11 ... 9 + 9 = 18


    public static void main(String[] args) {

        printRaf(1, 1);
        printRaf(1, 2);
        printRaf(1, 3);
        printRaf(1, 4);
        printRaf(1, 5);
        printRaf(1, 6);
        printRaf(1, 7);
        printRaf(1, 8);
        printRaf(1, 9);
    }

    public static int fun (int i, int i1) {
        int sum = i1 + i;
        System.out.printf("%d + %d = %d   ", i1, i, sum);
        i = i + 1;
        return i;
    }
    public static void printRaf (int i, int i1) {
        i = fun(i, i1);
        i = fun(i, i1);
        i = fun(i, i1);
        i = fun(i, i1);
        i = fun(i, i1);
        i = fun(i, i1);
        i = fun(i, i1);
        i = fun(i, i1);
        fun(i, i1);
        System.out.println();


    }
}
