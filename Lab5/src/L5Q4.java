/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Scanner;

public class L5Q4 {
    public static void main (String [] args)
    {
        Random g = new Random();
        int Max = Integer.MIN_VALUE;
        int i;
        int [] number = new int [21];
        Set <Integer> takulang = new HashSet <> ();
        
        System.out.println("A list of 20 random integer within 0 to 100:");
        
        for (i = 0; i < 21; i++)
        {
            number[i] = g.nextInt(101);
            
            if (takulang.add(number[i]));
                    System.out.print(number[i] + "  ");
        }
        
        System.out.println("\nArray in descending order:");
        Arrays.sort(number);
        for (i = 20; i > 0; i--)
            System.out.print(number[i] + "  ");
        
        
        System.out.print("\n\nEnter a number to search:");
        Scanner t = new Scanner(System.in);
        int input = t.nextInt();
        
        System.out.println(input +" found");
        
        for (int n = 0; n < 20;n++)
        {
            if (input == number[n])
            {
                System.out.print("Linear search = " + n + " loop(s)");
                break;
            }
            else
                continue;
        }
        
//        int low =0;
//        int high = 19;
//        
//        while (low <= high)
//        {
//            int mid = (low + high)/2;
//            
//            if(number[mid] == input)
//            {
//                System.out.print("Binary search = " + mid + " loop(s)");
//                break;
//            }
//            else if (number[mid] < input)
//                high = mid -1;
//            else
//                low = mid + 1;
//        }

        int low = 0;
        int high = 19;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (number[mid] == input) {
                System.out.print("Binary search = " + mid + " loop(s)");
                break;
            } else if (number[mid] < input)
                high = mid - 1;
            else
                low = mid + 1;
        }
    }
}
