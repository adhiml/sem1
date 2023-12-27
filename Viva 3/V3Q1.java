/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

import java.util.Random;

public class V3Q1 {
    public static void main(String[] args) {
        Phantom phantom = new Phantom();
        BlackMage blackMage = new BlackMage();

        System.out.println("The epic battle begins! ");

        while (blackMage.getHp() > 0)   
    //battle loop continues until hp of the blackMge becomes 0.
        {
            int damage = phantom.damage(blackMage);
            blackMage.deductHp(damage); // Deduct hp from blackMage
            System.out.println(phantom.toString(damage, blackMage.getHp()));
        }

        System.out.println("The Black Mage is defeated... ");
    }
}

class Phantom {
    private double accuracy;
    private double critRate;

    // Empty constructor initializing Phantom's accuracy and critRate.
    
    
    public Phantom() {
        this.accuracy = 1.00;
        this.critRate = 1.00;
    }

    
    public Phantom(double accuracy, double critRate) {
        // Constructor with two parameters initializing Phantom's 
        // accuracy and critRate. Limiting values to the range[0.00,1.00].
        this.accuracy = Math.max(0.00, Math.min(accuracy, 1.00)); // for range
        this.critRate = Math.max(0.00, Math.min(critRate, 1.00));
    }
    
    
    // Accessor methods and mutator methods for both variables with the limit restrictions imposed.
    
    public double getAccuracy() {
        return accuracy;
    }
    
    public double getCritRate() {
        return critRate;
    }
    
    // mutator
    public void setAccuracy(double accuracy) {
        //Limiting the value with range [0.00,1.00]
        this.accuracy = Math.max(0.00, Math.min(accuracy, 1.00));
    }

    public void setCritRate(double critRate) {
        //Limiting the value with range [0.00,1.00]
        this.critRate = Math.max(0.00, Math.min(critRate, 1.00));
    }

    
    // Damage calculation method for damage dealt by the Phantom 
    // and BlackMage based on accuracy, evasion and critical hit rate
    
    
    public int damage(BlackMage blackMage) {
        Random rd = new Random();
        
        //total effectice accuracy via multiplication of accuracy and evasion
        double totalEffectiveAccuracy = accuracy * (1 - blackMage.getEvasion()); 
        
        //total effective accuracy via subtraction of critResistance from critRate.
        double totalEffectiveCritRate = critRate - blackMage.getCritResistance();   
        
        //damage value
        if (rd.nextDouble() < totalEffectiveAccuracy) {
            if (rd.nextDouble() < totalEffectiveCritRate) {
                return 4; // Critical hit
            } else {
                return 2; // Normal hit
            }
        } else {
            return 0; //  Missed hit
        }
    }
    

    // toString method that returns a combat log message
    
    public String toString(int damage, int blackMageHp) 
    {
        String hit = (damage == 0) ? "[MISS]" : "[NORM]";
        return String.format("%s Phantom has dealt %d damage to the "
                + "Black Mage (%d/100)" , hit, damage, blackMageHp);
    }
    
}

class BlackMage {
    private int hp;
    private final double evasion;
    private final double critResistance;

    // Empty constructor initialize default value :  100 hp, 
    // 5% evasion and 10% critResistance
    
    BlackMage() {
        this.hp = 100;
        this.evasion = 0.05;
        this.critResistance = 0.10;
    }

    // Accessor methods
    public int getHp() {
        return hp;
    }

    public double getEvasion() {
        return evasion;
    }

    public double getCritResistance() {
        return critResistance;
    }

    // Method to deduct HP based on damage received. 
    // hp doesn't go below 0 
    // hp = health point
    public void deductHp(int damage) {
        hp = Math.max(0, hp - damage);
    }
}



