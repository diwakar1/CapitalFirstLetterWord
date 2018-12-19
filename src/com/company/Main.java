package com.company;
// it capitalizes the first letter of each words.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String string = in.nextLine();


        capitalizeFirstWord(string);
        System.out.print("From second method: "+ capitaizedWords(string));
        System.out.print("\nFrom third method: "+ capitalizeWord(string));
    }

    public static void capitalizeFirstWord(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (i == 0)
                a[i] = Character.toUpperCase(a[i]);
            if (a[i] == ' ')
                a[i + 1] = Character.toUpperCase(a[i + 1]);
        }

        System.out.print("From first method : " );
        System.out.println(a);


    }

    public static String capitaizedWords( String s) {

        String st = "";
        Scanner scan = new Scanner(s);
        while (scan.hasNext()){
            String word=  scan.next();
            st += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        return st;
    }


    public static  String capitalizeWord(String s) {
        String[] strings = s.split(" ");
        String capitalizedWord= "";
        for (String s3 : strings) {
            capitalizedWord += s3.substring(0, 1).toUpperCase() + s3.substring(1, s3.length()) + " ";

            /*other way too
             capitalizedWord =Character.toUpperCase(s3.charAt(0)) + s3.substring(1, s3.length()) + " ";

            using loops differently
            for(int a = 0; a<strings.length;a++) {
            System.out.print(strings[a].substring(0, 1).toUpperCase()
             + strings[a].substring(1, strings[a].length()) + " ");

            System.out.print(Character.toUpperCase(strings[a].charAt(0))
                    +strings[a].substring(1, strings[a].length()) + " ");

        }
        */
        }


        return capitalizedWord;


    }

}
