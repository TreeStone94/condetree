import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        printStr(x, y);
    }
    public static void printStr(int x, int y) {
        int maxX = 1;
        int maxNum = 0;
        for(int i=1; i<=x;i++) {
            if(x % i == 0) {
                maxX = i;
            }
            for(int j=1;j<=y;j++) {
                if(y % j == 0 && maxX == j) {
                    maxNum = j;
                }
            }
        }
        System.out.println(maxNum);
    }  
}