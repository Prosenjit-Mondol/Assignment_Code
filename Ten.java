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
public class Ten {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input a String :");
        String str=in.nextLine();
        String[] words= str.split("[ ]+");
        System.out.println("Penultimate word : "+words[words.length-1]);
    }
}
