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
class f
{
    int a,b,i,d,r,a1=1,b1=1;
    void fun()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a and b");
        a = in.nextInt();
        b = in.nextInt();
        for(i=1;i<=a;i++)
        {
            a1=a1*i;
        }
        //System.out.println(a1);
        for(i=1;i<=b;i++)
        {
            b1=b1*i;
        }
        //System.out.println(b1);
        d=b1/a1;
        System.out.println(d);
        r = d%10;
        System.out.println(r);
    }
}
public class fact {
    public static void main(String args[])
    {
        f obj = new f();
        obj.fun();
    }
}
