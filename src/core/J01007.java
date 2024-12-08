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
public class J01007 {

    /**
     * @param args the command line arguments
     */
    static long[] f = new long[100];

    static void fibo() {
        f[0] = 0;
        f[1] = f[2] = 1;
        for (int i = 3; i <= 93; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        fibo();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            boolean check = false;
            for (int i = 0; i <= 93; i++) {
                if (f[i] == n) {
                    check = true;
                    break;
                }
            }
            System.out.println(check ? "YES" : "NO");
        }
    }

}
