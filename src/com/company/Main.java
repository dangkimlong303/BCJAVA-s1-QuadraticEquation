package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double numA;
        double numB;
        double numC;
        double delta;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        numA = sc.nextDouble();
        System.out.print("Enter number b: ");
        numB = sc.nextDouble();
        System.out.print("Enter number c: ");
        numC = sc.nextDouble();
        delta = Math.pow(numB,2) - (4*numA*numC);

        if (numA == 0){
            if (numB == 0){
                if (numC == 0){
                    System.out.println("Equation countless solutions");
                }else {
                    System.out.println("Equation has no solution");;
                }
            }else {
                System.out.println("Equation has 1 solution x = " + (-numB/numA));
            }
        }else {
            if (delta < 0){
                System.out.println("Equation has no solution");
            }else if (delta == 0){
                System.out.println("Equation has 1 solution x = " + (-numB/(2*numA)));
            }else {
                System.out.println("Equation has 2 solutions x1 = " + (-numB+Math.sqrt(delta))/(2*numA));
                System.out.println("Equation has 2 solutions x2 = " + (-numB-Math.sqrt(delta))/(2*numA));
            }
        }
    }
}
