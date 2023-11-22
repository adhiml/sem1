/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lextureexcercisew5;

/**
 *
 * @author saada
 */
import java.util.Scanner;
import java.util.Random;

public class LextureExcerciseW5 {
    public static void main ( String [] args)
    {
/////////////////////////////////// q1 /////////////////////////////////////////
      
//        System.out.print("Please enter coordinate x:");
//        Scanner g =  new Scanner(System.in);
//        int x = g.nextInt();
//        
//        System.out.print("Please enter coordinate y:");
//        int y = g.nextInt();
//        
//        System.out.print("""
//                         Left = L
//                         Right = R
//                         Up = U
//                         Down = D
//                         """);
//        System.out.print("Please enter your move:");
//        Scanner h = new Scanner(System.in);
//        String move = h.nextLine();
//        
//       
//        for (int i = 0;i < move.length();i++)
//        {
//            if (move.charAt(i) == 'U')
//                y++;
//            if (move.charAt(i) == 'D')
//                y--;
//            if (move.charAt(i) == 'R')
//                x++;
//            if (move.charAt(i) == 'L')
//                x--;
//        }
//        
//        System.out.print("New coordinate:(" + x + "," + y + ")\n");
        
/////////////////////////////////// q2 /////////////////////////////////////////
        
        String durian;
        float weight = 0;
        float result = 0;
        float sum = 0;
        
        Scanner g = new Scanner (System.in);
        
        do{
        System.out.println("Enter \"QUIT\" if you want to exit.");
        System.out.print("Please enter the type of durian:");
        durian = g.nextLine();
        
        if (durian.equals("Quit"))
            break;
        
                System.out.print("\nPlease enter the sales in kg:");
                weight = g.nextFloat();
                {
                    if (durian.equals("MK"))
                        result = 25 * weight;
                    if (durian.equals("HL"))
                        result = 22 * weight;
                    if (durian.equals("D24"))
                        result = 20 * weight;
                    if (durian.equals("UM"))
                        result = 18 * weight;
                }

        sum += result;
        } while (true);
        
        System.out.printf("Total sales:%.2f%n",sum);
        
/////////////////////////////////// q3 /////////////////////////////////////////
        
//        Random g = new Random();
//        
//        System.out.print("Enter the number of staff [N]:");
//        Scanner h = new Scanner (System.in);
//        int staff = h.nextInt();
//        int number =  0;
//        
//        for ( int i = 0; i < staff; i++)
//        {
//           int staffID = g.nextInt(90000);
//           System.out.println("Staff ID:" + staffID);
//           
//           int secdigit = (staffID / 10) % 10;
//           int fourthdigit = (staffID / 1000) % 1000;
//           
//                if (secdigit%2 != 0 && fourthdigit%2 == 0)
//                {
//                    System.out.println("Weekend Duty");
//                    number++;
//                }
//                else
//                    System.out.println("Weekend Off");
//        }
//        System.out.println("The number of staff working duringweekend is " + number +".");
    }
}
