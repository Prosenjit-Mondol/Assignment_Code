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
public class Six {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of x :");
        int a=in.nextInt();
        System.out.print("Enter the value of y :");
        int b=in.nextInt();
        System.out.print("Enter the value of p :");
        int p=in.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(i%p==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
