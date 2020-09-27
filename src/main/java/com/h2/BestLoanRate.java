package com.h2;

import java.util.Scanner;
import java.util.Map

public class BestLoanRate{
    public static final Map<Integer, Float> BEST_RATE = Map.of(1,5.570, 2,3.45f, 3,2.67f)

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);
        System.out.println("Enter the loan term (in years)");
        int loanTermInYears = scanner.nextInt();
        float bestRate = getRates(loanTermInYears);

        if (bestRate == 0.00f){
            System.out.println("No available rate for term: " + loanTermInYears + " years")
        }else {
            System.out.println("Best rate fornterm: " + getRates(loanTermInYears) +"%");
        }

        scanner.close();
    }

    public static float getRates(int loanTermInOfYears){
        if (BEST_RATE.containsKey(loanTermInOfYears)){
            return BEST_RATE.valueOf(loanTermInOfYears);
        }else {
            return 0.00f;
        }
    }
}