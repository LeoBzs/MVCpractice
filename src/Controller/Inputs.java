package Controller;

import java.util.Scanner;
public class Inputs {
    public static int leInt(){
        return new Scanner(System.in).nextInt();
    }

    public static String leString(){
        return new Scanner(System.in).nextLine();
    }
}