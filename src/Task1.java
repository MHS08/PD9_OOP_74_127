
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MHS
 */
public class Task1 {

    static int wordCounter(String s) {
        int spcCount = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == ' ') {
                spcCount++;
            }
        }
        int wordCount = ++spcCount;
        return wordCount;
    }

    ;
  //
  static int vowelCounter(String s) {
        int vowelCount = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    ;
  static int puncCount(String s) {
        int puncCount = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == ':' || s.charAt(i) == ';' || s.charAt(i) == '!'
                    || s.charAt(i) == '?' || s.charAt(i) == '-' || s.charAt(i) == '_' || s.charAt(i) == '(' || s.charAt(i) == ')'
                    || s.charAt(i) == '[' || s.charAt(i) == ']' || s.charAt(i) == '\"' || s.charAt(i) == '\'' || s.charAt(i) == '/') {
                puncCount++;
            }
        }

        return puncCount;
    }

    ;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String s = input.nextLine();
        int word = wordCounter(s);
        int vowel = vowelCounter(s);
        int punc = puncCount(s);

        System.out.println("Number of words:" + word);
        System.out.println("Number of vowels:" + vowel);
        System.out.println("Number of punctuations:" + punc);
        System.out.println("Hello World");

        // TODO code application logic here
    }

}
