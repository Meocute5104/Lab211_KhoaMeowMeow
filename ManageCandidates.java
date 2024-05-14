/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candidates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MSII
 */
public class ManageCandidates {

    private List<Candidates> list;
    Scanner sc = new Scanner(System.in);

    public ManageCandidates() {
        list = new ArrayList<>();
        this.generateRandom();
    }

    public void createExp() {
        boolean checkout = true;
        do {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter First Name: ");
            String fn = sc.nextLine();
            System.out.print("Enter Last Name: ");
            String ln = sc.nextLine();
            System.out.print("Enter Birth Date: ");
            String bd = Validator.checkBirthDate();
            System.out.print("Enter Address: ");
            String add = sc.nextLine();
            System.out.print("Enter Phone: ");
            String po = Validator.checkPhone();
            System.out.print("Enter Email: ");
            String em = Validator.checkEmail();
            System.out.print("Enter year of experience: ");
            int ye = Validator.checkYearofExp();
            System.out.print("Enter ProSkill: ");
            String pr = sc.nextLine();
            Candidates x = new Experience(id, fn, ln, bd, add, po, em, 0, ye, pr);
            list.add(x);
            System.out.print("DO you want to continue? : ");
            String choose = sc.nextLine();
            if (choose.equals("N")) {
                checkout = false;
                output();
            }
        } while (checkout);
    }

    public void createFresher() {
        boolean checkout = true;
        do {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter First Name: ");
            String fn = sc.nextLine();
            System.out.print("Enter Last Name: ");
            String ln = sc.nextLine();
            System.out.print("Enter Birth Date: ");
            //String bd = sc.nextLine();
            String bd = Validator.checkBirthDate();
            System.out.print("Enter Address: ");
            String add = sc.nextLine();
            System.out.print("Enter Phone: ");
            String po = Validator.checkPhone();
            System.out.print("Enter Email: ");
            String em = Validator.checkEmail();
            System.out.print("Enter graduated time: ");
            String ye = sc.nextLine();
            System.out.print("Enter graduated rank: ");
            String ra = Validator.checkRank();
            System.out.print("Enter Univeristy: ");
            String uni = sc.nextLine();
            Candidates x = new Fresher(id, fn, ln, bd, add, po, em, 1, ye, ra, uni);
            list.add(x);
            System.out.print("DO you want to continue? : ");
            String choose = sc.nextLine();
            if (choose.equals("N")) {
                checkout = false;
                output();
            }
        } while (checkout);
    }

    public void createIntern() {
        boolean checkout = true;
        do {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter First Name: ");
            String fn = sc.nextLine();
            System.out.print("Enter Last Name: ");
            String ln = sc.nextLine();
            System.out.print("Enter Birth Date: ");
            String bd = Validator.checkBirthDate();
            //Validator.checkBirthDate(bd);
            System.out.print("Enter Address: ");
            String add = sc.nextLine();
            System.out.print("Enter Phone: ");
            String po = Validator.checkPhone();
            System.out.print("Enter Email: ");
            String em = Validator.checkEmail();
            System.out.print("Enter majors: ");
            String ma = sc.nextLine();
            System.out.print("Enter semester: ");
            int se = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Univeristy: ");
            String uni = sc.nextLine();
            Candidates x = new Intern(id, fn, ln, bd, add, po, em, 2, ma, se, uni);
            list.add(x);
            System.out.print("DO you want to continue? : ");
            String choose = sc.nextLine();
            if (choose.equals("N")) {
                checkout = false;
                output();
            }
        } while (checkout);
    }

    public void output() {
        System.out.println("List of candidate: ");
        System.out.println("=====EXPERIENCE CANDIDATE=====");
        for (Candidates x : list) {
            if (x instanceof Experience) {
                System.out.println(x.getLastName() + " " + x.getFirstName());
            }
        }
        System.out.println("=====FRESHER CANDIDATE=====");
        for (Candidates x : list) {
            if (x instanceof Fresher) {
                System.out.println(x.getLastName() + " " + x.getFirstName());
            }
        }
        System.out.println("=====INTERN CANDIDATE=====");
        for (Candidates x : list) {
            if (x instanceof Intern) {
                System.out.println(x.getLastName() + " " + x.getFirstName());
            }
        }
    }

    public void searchByName(String s) {
        System.out.println("The caindidates found: ");
        for (Candidates x : list) {
            if (x instanceof Experience && (x.getFirstName().toLowerCase().contains(s.toLowerCase())
                    || x.getLastName().toLowerCase().contains(s.toLowerCase()))) {
                System.out.println(x.getLastName() + " " + x.getFirstName() + " | " + x.getBirthDate() + " | " + x.getAddress() + " | " + x.getPhone() + "| " + x.getEmail() + " | " + x.getType());
            }
        }
        for (Candidates x : list) {
            if (x instanceof Fresher && (x.getFirstName().toLowerCase().contains(s.toLowerCase())
                    || x.getLastName().toLowerCase().contains(s.toLowerCase()))) {
                System.out.println(x.getLastName() + " " + x.getFirstName() + " | " + x.getBirthDate() + " | " + x.getAddress() + " | " + x.getPhone() + "| " + x.getEmail() + " | " + x.getType());
            }
        }
        for (Candidates x : list) {
            if (x instanceof Intern && (x.getFirstName().toLowerCase().contains(s.toLowerCase())
                    || x.getLastName().toLowerCase().contains(s.toLowerCase()))) {
                System.out.println(x.getLastName() + " " + x.getFirstName() + " | " + x.getBirthDate() + " | " + x.getAddress() + " | " + x.getPhone() + "| " + x.getEmail() + " | " + x.getType());
            }
        }
    }

    public void generateRandom() {
        list.add(new Experience(1, "Khoa", "Nguyen", "2004", "Hai Duong", "0922769999", "khoanguyen@gmail.com", 0, 4, "no"));
        list.add(new Experience(2, "Khoa", "Tran", "2003", "Hai Phong", "0919137387", "khoatran@gmail.com", 0, 4, "no"));
        list.add(new Experience(3, "Khoa", "Dinh", "1990", "Ha Noi", "0922768888", "khoadinh@gmail.com", 0, 4, "no"));
        list.add(new Fresher(4, "Khoa", "Mac", "1993", "Da Nang", "0911768799", "khoamac@gmail.com", 1, "2020", "Good", "FPT Univeristy"));
        list.add(new Fresher(5, "Khoa", "Ly", "1997", "Dong Nai", "0922769999", "khoaly@gmail.com", 1, "2021", "Good", "FPT Univeristy"));
        list.add(new Fresher(6, "Khoa", "David", "1996", "Ho Chi Minh", "0922769999", "khoadavid@gmail.com", 1, "2022", "Good", "FPT Univeristy"));
        list.add(new Intern(4, "Khoa", "Le", "1993", "Da Nang", "0922769999", "khoamac@gmail.com", 2, "IT", 1, "FPT Univeristy"));
        list.add(new Intern(4, "Khoa", "Trinh", "1993", "Da Nang", "0922769999", "khoamac@gmail.com", 2, "SE", 2, "FPT Univeristy"));
        list.add(new Intern(4, "Khoa", "Dao", "1993", "Da Nang", "0922769999", "khoamac@gmail.com", 2, "HE", 3, "FPT Univeristy"));
    }
}
