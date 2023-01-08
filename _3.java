package SubtractofTwoNumber;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        int A, B, C, D, sub;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any number");

        A = Sc.nextInt();
        B = Sc.nextInt();
        C = Sc.nextInt();
        D = Sc.nextInt();
        sub= A-B-C-D;
        System.out.println(" sub " + sub);
    }
}
