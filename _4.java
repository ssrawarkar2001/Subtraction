package SubtractofTwoNumber;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;
        int E;
        int sub;

        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter any Number");

        A = Sc.nextInt();
        B = Sc.nextInt();
        C = Sc.nextInt();
        D = Sc.nextInt();
        E = Sc.nextInt();

        sub= A-B-C-D-E;

        System.out.println("Ans = " + sub);
    }
}
