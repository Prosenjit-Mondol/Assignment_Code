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
public class Fourteen {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input the first number :");
        int a=in.nextInt();
        System.out.print("Input the Second number :");
        int b=in.nextInt();
        int a1=a/10;
        a=a%10;
        int b1=b/10;
        b=b%10;
        if(a==b||a==b1||a1==b||a1==b1)
        System.out.println("true");
        else
            System.out.println("false");
    }
}
