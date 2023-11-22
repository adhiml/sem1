/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6;


import java.util.Scanner;
public class T6Q1 {
    
    private static int highest = Integer.MIN_VALUE;
    
    public static void main(String[] args) 
    {
            Scanner g = new Scanner(System.in);
            
//            System.out.print("Question a.\n");
//            for (int i = 0; i < 3; i++)
//            {
//                System.out.print("Enter an integer:");
//                int n = g.nextInt();
//                maxNum(n);
//            }
//            System.out.println("The maximum number is " + highest);
//            
//            System.out.print("\nQuestion b.\n");
//            
//            System.out.print("Enter an integer:");
//            int k = g.nextInt();
//            squareNum(k);
//            System.out.println("The number " + k + (squareNum(k)? " is a square number." : " is not a square number."));
            
            System.out.print("\nQuestion c.\n");
            
            System.out.print("For C(n,k), enter n:");
            int n = g.nextInt();
            System.out.print("For C(n,k), enter k:");
            int K = g.nextInt();
            System.out.println("C(n,k) = n! / (k! (n-k)! = " + permutation(n,K));
    }
    
//////////////////////////////////////// a. ////////////////////////////////////  
    
    public static int maxNum (int n)
        {
            if (n > highest)
                highest = n;
            return highest;
        }
//////////////////////////////////////// a. ////////////////////////////////////
    
    public static boolean squareNum (int k)
    {
        int sqrt = (int) Math.sqrt(k);
        return sqrt*sqrt == k;
    }
    
    public static int permutation (int n, int K)
    {
        int calc = 0;
        while (n > 0 && K > 0)
        {
             calc = ((n += n * (n - 1)) / ((K*(K-1))*((K - n)*(K -n -1))));
             n--;
             K--;
        }
        
        return calc;
    }
    
}
