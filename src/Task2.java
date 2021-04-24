
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
class data{

        public String s;
        public String displayVertical() {
            String output = "";
            int size = this.s.length();
            for (int i = 0; i < size; i++) {
                if (this.s.charAt(i) != ' ') {
                    output = output + this.s.charAt(i) + "\n";
                }
            }
            return output;
        }
    }

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        data d = new data();
        System.out.println("Enter a Sentence");
        d.s = input.nextLine();
        String output = d.displayVertical();
        System.out.println("Your sentence printed vertically is:");
        System.out.println(output);
    }

    
}
