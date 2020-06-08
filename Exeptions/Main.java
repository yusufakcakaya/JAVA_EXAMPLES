package exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int x = 98;
        int y = 0;

        System.out.println(divideN(x, y));
        System.out.println(divideN(x, y));
        System.out.println(divide(x, y));
        */
        int x = getIntE();
        System.out.println("x is " + x);
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("please enter an integer");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    // Exeptions help to write more easy and more efficient codes

    public static int getIntE (){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("please enter an integer");
        try{
           return s.nextInt();
        }catch(InputMismatchException e){
            return 0;
        }
    }

    public static int divideN(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    public static int divideE(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    public static int divide(int x, int y) {
        return x / y;
    }
}
