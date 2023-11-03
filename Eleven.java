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
public class Eleven {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Input a word :");
        String word=in.nextLine();
        word=word.trim();
        //String result="";
        char[] ch=word.toCharArray();
        for(int i=word.length()-1;i>=0;i--)
        {
            System.out.print((ch[i]));//result+=ch[i];
        }
        System.out.println();
    }
}
