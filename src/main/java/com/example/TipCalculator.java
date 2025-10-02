package com.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW 

        //I learned how to round to two decimal places here: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        double tipAmount = cost*(percent/100.0);
        double totalCost = cost+tipAmount;
        double perPersonCostBefore = cost/people;
        double tipPerPerson = tipAmount/people;
        double perPersonCostAfter = totalCost/people;
        totalCost = Math.round(totalCost*100.0)/100.0;
        perPersonCostBefore = Math.round(perPersonCostBefore*100.0)/100.0;
        tipPerPerson = Math.round(tipPerPerson*100.0)/100.0;
        tipAmount = Math.round(tipAmount*100.0)/100.0;
        perPersonCostAfter = Math.round(perPersonCostAfter*100.0)/100.0;

        String result = "-------------------------------\n" +
                       "Total bill before tip: $" + cost + "\n" +
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
        double tipAmount = cost*(percent/100.0);
        double totalCost = cost+tipAmount;
        double perPersonCostBefore = cost/people;
        double tipPerPerson = tipAmount/people;
        double perPersonCostAfter = totalCost/people;
        totalCost = Math.round(totalCost*100.0)/100.0;
        perPersonCostBefore = Math.round(perPersonCostBefore*100.0)/100.0;
        tipPerPerson = Math.round(tipPerPerson*100.0)/100.0;
        tipAmount = Math.round(tipAmount*100.0)/100.0;
        perPersonCostAfter = Math.round(perPersonCostAfter*100.0)/100.0;
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        //enter your code here 
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
        int people=6; 
        int percent=25;
        double cost=52.27;              
        System.out.println(calculateTip(people,percent,cost));
        // System.out.println(extraCredit(people, percent, cost));
    }
}
        
