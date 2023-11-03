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
public class Thirteen {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input the first number :");
        int a=in.nextInt();
        System.out.print("Input the Second number :");
        int b=in.nextInt();
        if(a==b)
        {
            System.out.println("0");
        }
         if(a%6==b%6)
           {
                System.out.println(Math.min(a, b));
            }
         System.out.println(Math.max(a, b));
        }
    }
}
