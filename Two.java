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
public class Two {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first number :");
        int x=in.nextInt();
        System.out.print("Enter the second number :");
        int y=in.nextInt();
        System.out.print("Enter the third number :");
        int z=in.nextInt();
        if((x+y)==z)
        {
            System.out.println("The result is : True");
        }
        else
        {
            System.out.println("The result is: False");
        }
    }
}
