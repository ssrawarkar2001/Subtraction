package SubtractofTwoNumber;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        int A, B, C, subtract;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any number");

        A = Sc.nextInt();
        B = Sc.nextInt();
        C = Sc.nextInt();

        subtract = A-B-C;

        System.out.println("subtract " + subtract);


    }
}
