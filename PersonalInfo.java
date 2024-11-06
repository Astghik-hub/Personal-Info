package Assignment1;

import java.util.Scanner;
/**
 * Assignment 01 Task 01 Personal Information
 *
 * @author Astghik Minasyan
 */
public class PersonalInfo {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = info.nextLine();
        System.out.print("Please enter your age: ");
        int age = info.nextInt();
        System.out.print("Please enter your gender: ");
        String gender = info.nextLine();
        System.out.print("Please enter your department: ");
        String dep = info.nextLine();
        System.out.print("Please enter the value of PI (3.1415926): ");
        Double pi = info.nextDouble();

        System.out.printf("\n%-14s: %s", "Name", name);
        System.out.printf("\n%-14s: %s", "Age", age);
        System.out.printf("\n%-14s: %s", "Gender", gender);
        System.out.printf("\n%-14s: %s", "Department", dep);
        System.out.printf("\n%-14s: %.2f", "PI", pi);
    }
}