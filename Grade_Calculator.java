import java.util.*;

class Grade_Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mark[] = new int[6];
        float tot = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter mark for subject " + (i + 1) + ":");

            mark[i] = sc.nextInt();
            tot = tot + mark[i];
        }
        char grade;
        float avg = tot / 6;

        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 70) {
            grade = 'B';
        } else if (avg >= 60) {
            grade = 'C';
        } else if (avg >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("TOTAL : " + tot);
        System.out.println("AVERAGE : " + avg);
        System.out.println("GRADE : " + grade);
    }
}
