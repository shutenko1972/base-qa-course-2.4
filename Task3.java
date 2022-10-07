public class Task3 {
    //Задача №2
    //Напечатать числа в виде следующей таблицы:
    //5
    //5 5
    //5 5 5
    //5 5 5 5
    //5 5 5 5 5

    //public static void main(String[] args) {
    //System.out.println("5");
    //System.out.println("55");
    //System.out.println("555");
    //System.out.println("5555");
    //System.out.println("55555");
//}

        public static void main(String[] args) {
            String five = "5";
            System.out.println(five);

            five = print5(five);
            five = print5(five);
            five = print5(five);
            print5(five);
        }

        public static String print5(String str) {
            System.out.println(str + " 5");
            return str + " 5";
        }




    }

