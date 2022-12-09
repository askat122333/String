import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //join()
        String joined = String.join("/", "2014", "10", "28" );
        System.out.println(joined);
        joined = String.join(" - ", "12","13","14");
        System.out.println(joined);

        System.out.println("_______________________________");

        //compareTo()
        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я буду хорошим программистом!";
        String str3 = "Я буду хорошим дворником!";

        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);

        result = str3.compareTo(str1);
        System.out.println(result);

        System.out.println("_______________________________");

        //charAt()
        String array = "Hello";
        System.out.println(array.charAt(0));
        System.out.println(array.charAt(4));

        System.out.println("_______________________________");

        //getChars()
        String Str1 = ("Добро пожаловать в Java F22");
        char[] Str2 = new char[7];

        try {
            Str1.getChars(2, 9, Str2, 0);
            System.out.print("Скопированное значение: " );
            System.out.println(Str2);

        } catch (Exception ex) {
            System.out.println("Возникает исключение...");
        }

        System.out.println("_______________________________");

        //equals()
        Scanner sc = new Scanner(System.in);
        String text1 = "For";
        System.out.println("Введите текст :");
        String text2 =sc.next();
        if (text2.equals(text1)) {
            System.out.println("Одинаково");
        }else {
            System.out.println("Не одинаово");
        }

        System.out.println("_______________________________");


        //equalsIgnoreCase()
        String st1 = "Hello World!";
        String st2 = "HELLO WORLD!";
        String st3 = "Hello everyone";
            //true
        System.out.println(st1.equalsIgnoreCase(st2));
            //false
        System.out.println(st1.equalsIgnoreCase(st3));

    }
}