import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
         Scanner sc = new Scanner(System.in);
         int rowNum = sc.nextInt();
         print(rowNum);
    }

    public static void print(int x) {
        int printNum = 1;
        for(int i=1;i<=x*x;i++) {
            if(printNum > 9) {
                printNum = 1;
            }
            System.out.print(printNum + " ");
            if(i % x == 0) {
                System.out.println();

            }
            printNum++;
        }
    }
}