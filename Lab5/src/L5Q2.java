/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class L5Q2 {
    public static void main(String [] args)
    {
        Random g = new Random();
        Set <Integer> takulang = new HashSet <> ();
        int [] random = new int[10];

        for (int i = 0; i < 10 ; i++)
        {
            random[i] = g.nextInt(21);
            
            if (takulang.add(random[i]))
                {
                    System.out.print(random[i] + " ");
                } 
        }
    }
}
