import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        printStr(rowNum);
    }

    public static void printStr(int x) {
        for(int i=0; i<x;i++) {
            System.out.println("12345^&*()_");
        }
    }
}