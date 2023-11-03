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
public class Four {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input the first number :");
        int a=in.nextInt();
        System.out.print("Input the second number :");
        int b=in.nextInt();
        System.out.print("Input the third number :");
        int c=in.nextInt();
        a=a%10;
        b=b%10;
        c=c%10;
        if(a==b || b==c ||c==a)
        System.out.println("The result is: true");
        else
        System.out.println("The result is: false");    
    }
}
