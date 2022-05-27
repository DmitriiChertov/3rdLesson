public class Main {
    public static void main(String[] args) {
        int salary = 65535;
        int total = 0;
        int ii = 0;
        for (; total < 1_000_000; ii++) {
            total = total + total / 100;
            total = total + salary;
            if (ii % 5 == 0)
                System.out.println("месяц " + ii + " Итого " + total);
        }
        {
            System.out.println("Задача №1");
            int i = 0;
            while (i < 10) {
                System.out.print(++i + " ");
            }
            System.out.println( );
            for ( i = 10; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println( );
            System.out.println( );
            System.out.println("Задача №2");
            int friday = 1;
            for ( int dayNumber = friday; dayNumber <= 31 ; dayNumber +=7) {
                System.out.println("Сегодня пятница " + dayNumber + "е число");
            }
            System.out.println( );
        } System.out.println("Задача №3");
        int nowYear = 2022;
        int plusYear = nowYear + 100;
        int lastCommet = nowYear / 79;
        int llAst = lastCommet * 79;

        for ( int year = llAst - 79; year <= plusYear; year = year + 79) {
            System.out.println("В " + year + " году комета пролетала в непосредственной близости к земле.");
        }
        }



    }
