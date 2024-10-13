//Java program to ask student to enter the marks of the five units they did last semester, compute the average and display it on the screen. 
import java.util.Scanner;
public class studentaverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // array for the units
        int[] marks = new int[5];
        int totalMarks = 0;
        // Ask for the marks 
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks for unit " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];}
        // average
        double average = totalMarks / 5.0;
        // Display average
        System.out.println("The average marks of the five units is: " + average);
        scanner.close();
    }
}

