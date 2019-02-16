/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
class fact1
{
    int a,i,c,j=2,k,c1=0,c2=0;
    void fun()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        a  = in.nextInt();
        for(i=2;i<=a;i++)
        {
            for(j=2;j<=a;j++)
            {
            c = i+j;
            
            System.out.println(c);
            if(c==a)
            {
                for(k=2;k<i;k++)
                {
                    if(i%k==0)
                    {
                        c1=c1+1;
                    }
                }
                System.out.println(c1);
                for(k=2;k<j;k++)
                {
                    if(j%k==0)
                    {
                        c2=c2+1;
                    }
                }
                
                System.out.println(c2);
            if((c1==0)&&(c2==0))
            {
                System.out.println("Smith");
                break;
            }
            else
            {
                System.out.println("not smith");
            }
            
            //break;
            }else
            {
                System.out.println("Not a smith number");
            }
            
            
            
            }
        }
            }
}
public class prime {
    public static void main(String args[])
    {
        fact1 f =new fact1();
        f.fun();
    }
    
}
