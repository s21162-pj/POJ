/* Zadanie 05_07. - Grades Statistics
   Autor: Robert Brzoskowski
   Index: s21162
 */
package com.company;
import java.util.*;

public class GradesStatistics {
    public static void main(String[] args) {
        int numofstudents;
        int grade;
        int sumofgrades = 0;
        double average;
        double median = 0;
        double deviation = 0;

        ArrayList<Integer> grades = new ArrayList<Integer>();

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        numofstudents = userInput.nextInt();

        if (numofstudents > 0 && numofstudents <= 1000) {
            for (int i = 1; i <= numofstudents; i++) {
                System.out.print("Enter the grade for student " + i + ": ");
                grade = userInput.nextInt();
                grades.add(grade);
                sumofgrades = sumofgrades + grade;
            }
        }
        else{
            System.out.println("Too many students or wrong number");

        }
        System.out.println("The grades are: " + grades);

        average = Double.valueOf(sumofgrades)/Double.valueOf(numofstudents);
        System.out.printf("The average is: %.2f \n", average);
/* Mediana  */
        if (grades.size()%2 == 0) {
            median = ((double )grades.get(grades.size()/2) + (double) grades.get(grades.size()/2 - 1))/2;
        }
        else {
            median = (double) grades.get(grades.size() / 2);
        }
        System.out.printf("The median is: %.2f \n", median);
        System.out.println("The minimum is: " + Collections.min(grades));
        System.out.println("The maximum is: " + Collections.max(grades));

        int length = grades.size();
        double mean = sumofgrades / length;
        for(double num: grades) {
            deviation += Math.pow(num - mean, 2);
        }
        deviation = Math.sqrt(deviation/length);
        System.out.printf("The standard deviation is: %.2f ", deviation);
    }}