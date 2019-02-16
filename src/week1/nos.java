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
class num{
    int a,n,i,j;
    void fun()
    {
        Scanner in = new Scanner(System.in);
       
       System.out.println("enter number");
       a = in.nextInt();
       j=1;
       for(i=0;;i++)
       {
           if(j!=a+1)
           {
           if(i%10!=6)
           {
               n = i;
           }
           else
           {
              n = i + 4; 
              i=i+4;
           }
           }else
           {
               break;
           }
            //System.out.println(n);
           j++;
           
       }
       System.out.println(n);
    }
}
public class nos {
   public static void main(String args[]) 
   {
     num obj = new num();
     obj.fun();
   }
}
