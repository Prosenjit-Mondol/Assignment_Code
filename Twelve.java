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
public class Twelve {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a=in.nextInt();
        System.out.print("Input the second number: ");
        int b=in.nextInt();
        System.out.print("Input the third number: ");
        int c=in.nextInt();
        boolean r=((Math.abs(a-b))>=20 || (Math.abs(b-c))>=20 || (Math.abs(c-a))>=20);
        System.out.println(r);
    }
}
