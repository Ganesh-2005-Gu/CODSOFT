import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];   
        double total = 0;

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject  " + (i + 1) +" : " );
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        
        double Average =  total / n;
        
        double Average_Percentage = (total/(n*100))*100;

        
        String grade;
        if (Average >= 90) {
            grade = "A+";
        } else if (Average >= 80) {
            grade = "A";
        } else if (Average >= 70) {
            grade = "B";
        } else if (Average >= 60) {
            grade = "C";
        } else if (Average >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }
          
        
        System.out.println("Result :- ");
        System.out.println("Total Marks: " + total );
        System.out.println("Average Percentage: " + Average_Percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

