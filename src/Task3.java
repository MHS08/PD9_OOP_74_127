
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
public class Task3 {

    static String ridMultipleBlank(String s) {
        return s.replaceAll("( )+", " ");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String s = input.nextLine();
        String output = ridMultipleBlank(s);
        System.out.println(output);
    }
}
