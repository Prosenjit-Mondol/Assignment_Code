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
public class Three {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x = in.nextInt();  
	System.out.print("Input the second number: ");
	int y = in.nextInt(); 
	System.out.print("Input the third number : ");
        int z = in.nextInt();
        System.out.println("The result is: "+test(x,y,z));
    }
    public static boolean test(int p,int q, int r)
    {
        return(p<q&&q<r);
    }
}
