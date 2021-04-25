
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
        return s.replaceAll("( )+", " ").trim();
    }
    static String removeInteger(String s)
    {
        String output = "";
        for(int i=0;i<s.length();i++)
        {
            if(!(s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
                output = output + s.charAt(i);
            }
        }
        return output;
    };
    static String stringEncryption(String s)
    {
      String encrypted=" ";
      char[] array= s.toCharArray();
      for(char c: array)
      {
          if (c==' ')
          {
              c='*';
              encrypted = encrypted+c;
          }
          else
          {
              c++;
              encrypted =encrypted+c;
          }
      }
      return encrypted;
    };
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String s = input.nextLine();
        String output = removeInteger(s);
        String encryptedResult=stringEncryption(s);
        System.out.println(output);
        System.out.println(encryptedResult);
    }
}
