/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author HP
 */
import java.util.*;
public class Eight {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String str=in.nextLine();
        String upper="";
        Scanner line=new Scanner(str);
        while(line.hasNext())
                {
                    String word=line.next();
                    upper +=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
                }
        System.out.println(upper.trim());
    }
}
