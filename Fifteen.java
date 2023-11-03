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
public class Fifteen {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input the first number :");
        int a=in.nextInt();
        System.out.print("Input the Second number :");
        int b=in.nextInt();
        int r=a;
        a=a/b;
        a*=b;
        b=r-a;
        System.out.println(b);
    }
}
