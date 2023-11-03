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
public class Seven {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input an integer: ");
        int a=in.nextInt();
        int c=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
                c++;
        }
        c=c+1;
        System.out.println("the total number of factor "+c);
    }
}
