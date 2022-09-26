import java.util.Scanner;

public class Program {

    public static void main(String args[]) {
        int weeks = 0;
        long allMinGrades = 0;
    
        Scanner term = new Scanner(System.in);
        String str = term.nextLine();
        while (weeks <= 18 && !str.equals("42")) {
            weeks++;
            if (!str.equals("Week " + weeks)) {
                myExit(term);
            }
            allMinGrades *= 10;
            allMinGrades += getMinGrade(term);
            str = term.nextLine();
        }
        term.close();
        printStat(weeks, allMinGrades);        
    }

    private static void myExit(Scanner term) {
        System.err.println("Illegal Argument");
        term.close();
        System.exit(-1);
    }

    private static long getMinGrade(Scanner term) {
		int min = 9;
        int tmp;
        int i = 0;

		while (i < 5) {
            if (!term.hasNextInt()) {
                myExit(term);
            }
            tmp = term.nextInt();
            if (tmp < 1 || tmp > 9) {
                myExit(term);
            }
            if (min > tmp) {
                min = tmp;
            }
            i++;
		}
        term.nextLine();
		return(min);
    }

    private static void printStat(int weeks, long grades) {
        int i = 0;
        while (i < weeks) {
            System.out.print("Week " + (i + 1) + " ");
            print_signs(splitGrades(i, weeks, grades));
            i++;
        }
    }

    private static int splitGrades(int i, int weeks, long grades) {
        int singleGrade = 0;

        while (i < weeks - 1) {
            grades /= 10;
            i++;
        }
        singleGrade = (int)(grades % 10);
        return (singleGrade);
    }

    private static void print_signs(int grade) {
        int i = 0;

        while (i < grade)
        {
            System.out.print("=");
            i++;
        }
        System.out.println(">");
    }
}