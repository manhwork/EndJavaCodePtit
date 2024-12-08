/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package core;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01011 {

    /**
     * @param args the command line arguments
     */
    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
    }

}
