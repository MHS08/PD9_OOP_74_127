
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author G3NZ
 */
public class MyString {

    static boolean numValidator(String input) {
        boolean flag = true;
        int size = input.length();
        for (int i = 0; i < size; i++) {
            if (!(input.charAt(i) >= '0' && input.charAt(i) <= '9')) {
                flag = false;
            }
        }
        return flag;
    }

    static boolean palindrome(String a) {
        boolean flag = false;
        int size = a.length();
        String b = "";
        int x = 0;
        for (int i = (size - 1); i >= 0; i--) {
            b = b + a.charAt(i);
        }
        for (int i = 0; i < size; i++) {
            if ((a.charAt(i) == b.charAt(i)) || (a.charAt(i) == b.charAt(i) + 32) || (a.charAt(i) == b.charAt(i) - 32)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
    static int aCounter(String a)
    {
        int aCount = 0;
        int size = a.length();
        for (int i = 0; i < size; i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'A' ) {
                aCount++;
            }
        }
        return aCount;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string");
        String input = obj.next();
        boolean flag = numValidator(input);
        if (flag) {
            System.out.print("String is a Number");
        } else {
            System.out.print("String is not a Number");
        }
        if (flag) {
            System.out.print("It’s a palindrome");
        } else {
            System.out.print("It’s not a palindrome");
        }
    }
}
