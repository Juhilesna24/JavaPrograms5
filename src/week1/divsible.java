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
class div
{
    int k,n;
    int count=0;
    int a[]=new int[20];
    void cal()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n");
        n=in.nextInt();
        System.out.println("enter k");
        k=in.nextInt();
        System.out.println("enter array");
        for(int i=1;i<=n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
            if(a[i]%k==0)
            {
                count=count+1;
            }
        }
        System.err.println("count:"+count);
    }
}
public class divsible{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        div obj =new div();
        obj.cal();
    }
    
}
