import java.util.*;
public class Student_Grade_Calculator {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSub = sc.nextInt();
        int[] marks = new int[numSub];
        for (int i = 0; i < numSub; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double avgPer = (double) totalMarks / numSub;
        
        char grade;
        if (avgPer >= 90) {
            grade = 'O';
        } else if (avgPer >= 80) {
            grade = 'A';
        } else if (avgPer >= 70) {
            grade = 'B';
        } else if (avgPer >= 60) {
            grade = 'C';
        } 
          else if (avgPer >= 35) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPer + "%");
        System.out.println("Grade: " + grade);
        sc.close();
	}

}
