/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candidates;

import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class Main {
    public static void main(String[] args) {
        ManageCandidates list = new ManageCandidates();
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while(check){
            System.out.println("\n======CANDIDATE MANAGEMENT SYSTEM======\n");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            System.out.print("Enter your choose: ");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    list.createExp();
                    break;
                case 2:
                    list.createFresher();
                    break;
                case 3:
                    list.createIntern();
                    break;
                case 4:
                    sc.nextLine();
                    list.output();
                    System.out.print("\nInput Candidate Name (First name or Last name): ");
                    String name = sc.nextLine();
                    list.searchByName(name);
                    break;
                case 5:
                    System.out.println("\nTHE END!!!");
                    check = false;
                    break;
            }
        }
    }
}
