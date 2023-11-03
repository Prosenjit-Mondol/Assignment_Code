/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author HP
 */

public class Sixteen {
    
    public static int ispriem(int a)
    {
            for(int i=3;i<=a/2+1;i+=2)
            {
                if(a%i==0)
                    return 0;
            }
            return 1;
    }
    
    public static void main(String[] args)
    {
        int sum=2;
        for(int i=3;i<=100;i++)
        {
            if(i%2!=0)
            {
                if(ispriem(i)==1)
                sum+=i;
            }
        }
        System.out.println(sum);
        
    }
}
