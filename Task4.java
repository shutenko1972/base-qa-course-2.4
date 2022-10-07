public class Task4 {

//    Задача №3
//    Напечатать полную таблицу сложения в виде:
//            1 + 1 = 2 1 + 2 = 3 ... 1 + 9 = 10


public static void main(String[] args) {

    int a = 1;

    a = fun(a);
    a = fun(a);
    a = fun(a);
    a = fun(a);
    a = fun(a);
    a = fun(a);
    a = fun(a);
    a = fun(a);
    fun(a);
}

    public static int fun (int a) {
    int sum = 1 + a;
    System.out.printf("1 + %d = %d   ", a, sum);
        a = a + 1;
        return  a;


    }
}

