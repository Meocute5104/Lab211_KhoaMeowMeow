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
public class Validator {

    private static Scanner sc = new Scanner(System.in);

    public Validator() {
    }

    public static String checkBirthDate() {
        do {
            try {
                String x = sc.nextLine();
                boolean check1 = true;
                boolean check2 = true;
                if (x.length() != 4) {
                    check1 = false;
                }
                for (char i : x.toCharArray()) {
                    if (!Character.isDigit(i)) {
                        check2 = false;
                    }
                }
                if (check1 == false || check2 == false) {
                    throw new Exception("Birth Date is number with length is 4 characters!");
                } else {
                    return x;
                }
            } catch (Exception e) {
                //sc.nextLine();
                System.out.print("Enter BirthDate again: ");
            }
        } while (true);
    }

    public static String checkPhone() {
        do {
            try {
                String x = sc.nextLine();
                if (x.length() == 10) {
                    return x;
                } else {
                    throw new Exception("Phone is number with minimum 10 characters!");
                }
            } catch (Exception e) {
                //sc.nextLine();
                System.out.print("Enter Phone again: ");
            }
        } while (true);
    }

    public static String checkEmail() {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z.]+.com+$";
        do {
            try {
                String x = sc.nextLine();
                if (x.matches(regex)) {
                    return x;
                } else {
                    throw new Exception("Email is not valid");
                }
            } catch (Exception e) {
                //sc.nextLine();
                System.out.print("Enter email again: ");
            }
        } while (true);
    }

    public static int checkYearofExp() {
        do {
            try {
                int x = sc.nextInt();
                if (x > 100 || x < 0) {
                    throw new Exception("Year of Experience is invalid!");
                } else {
                    return x;
                }
            } catch (Exception e) {
                System.out.print("Enter year of experience again: ");
            }
        } while (true);

    }

    public static String checkRank() {
        do {
            try {
                String x = sc.nextLine();
                if (x.equals("Excellennce")
                        || x.equals("Good")
                        || x.equals("Fair")
                        || x.equals("Poor")) {
                    return x;
                } else {
                    throw new Exception("Rank of Graduation is Invalid!");
                }
            } catch (Exception e) {
                //sc.nextLine();
                System.out.print("Enter rank again: ");
            }
        } while (true);

    }
}
