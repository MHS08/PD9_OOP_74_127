
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
class string{

        public String data;
        public String displayVertical() {
            String output = "";
            int size = this.data.length();
            for (int i = 0; i < size; i++) {
                if (this.data.charAt(i) != ' ') {
                    output = output + this.data.charAt(i) + "\n";
                }
            }
            return output;
        }
    }

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        string s1 = new string();
        System.out.println("Enter a Sentence");
        s1.data = input.nextLine();
        String output = s1.displayVertical();
        System.out.println("Your sentence printed vertically is:");
        System.out.println(output);
    }

    
}
