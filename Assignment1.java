/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1;

/**
 *
 * @author dudam
 */

import java.util.Scanner;
public class Assignment1 {
    public void calculateLittering(float males, float females, float litters, float deposits) {
        float total = males + females;
        float litterMale, litterFemale;
        litterMale = (males/total) * ((litters/total)*100);
        litterFemale = (females/total) * ((litters/total)*100);
        System.out.println("The total number of littering males is: " + litterMale);
        System.out.println("The total number of littering females is: " + litterFemale);
    }
    public static void main(String[] args) {
        float totalMale, totalFemale, totalLitter, totalDeposit;

        Scanner scan = new Scanner(System.in);
        Assignment1 dof = new Assignment1();
        System.out.println("Enter the total of males: ");
        totalMale = scan.nextInt();
        System.out.println("Enter the total of females: ");
        totalFemale = scan.nextInt();
        System.out.println("Enter the total who deposits: ");
        totalLitter = scan.nextInt();
        System.out.println("Enter the total who litters: ");
        totalDeposit = scan.nextInt();

        dof.calculateLittering(totalMale, totalFemale, totalLitter, totalDeposit);
    }
}