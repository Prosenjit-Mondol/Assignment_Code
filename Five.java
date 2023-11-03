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
public class Five {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Input seconds: ");
        int s=in.nextInt();
        int ss=s%60;
        int m=s/60;
        int mm=m%60;
        int h=m/60;
        System.out.println(h+":"+mm+":"+ss);
    }
}
