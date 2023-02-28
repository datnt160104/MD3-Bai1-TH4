package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập giá trị b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập giá trị c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == c) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = (c - b) / a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
    }
    }

