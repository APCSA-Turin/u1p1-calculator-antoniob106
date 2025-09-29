package com.example;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      

        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        double cost2 = df.format(cost);
        double tipAmount = df.format(cost*(percent/100));Double.parseDouble
        double totalCost = df.format(cost+tipAmount);
        double perPersonCostBefore = df.format(cost/people);
        double tipPerPerson = df.format(tipAmount/people);
        double perPersonCostAfter = df.format(totalCost/people);


        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost2 + "\n" +
                       "Total percentage: " + percent + "%\n" +
                       "Total tip: $" + tipAmount + "\n" +
                       "Total Bill with tip: $" + totalCost + "\n" +
                       "Per person cost before tip: $" + perPersonCostBefore + "\n" +
                       "Tip per person: $" + tipPerPerson + "\n" +
                       "Total cost per person: $" + perPersonCostAfter + "\n" +
                       "-------------------------------\n";

        return result;
    }

    public static String extraCredit(int people, int percent, double cost) {
        String result = "Extra credit not implemented";
        boolean condition = true;
    
        //  COPY AND PASTE YOUR PROGRAM FROM calculateTip() HERE 
        
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops

        while (condition) {
            //enter your code here 
            System.out.println("placeholder");
            condition = false;
    
        }

        return result;
    }
    
    
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people=10; 
        int percent=8;
        double cost=10.5;              
        System.out.println(calculateTip(people,percent,cost));
        //System.out.println(extraCredit(people, percent, cost));
    }
}
        
