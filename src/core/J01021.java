/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01021 {

    private static final long MOD = (long) (1000000007);
//    Cách 1 :
//    private static long calc(long a, long b) {
//        long ans = 1;
//        while (b > 0) {
//            if (b % 2 == 1) {
//                ans = (ans * a) % MOD;
//            }
//            a = (a * a) % MOD;
//            b /= 2;
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            long a = sc.nextLong();
//            long b = sc.nextLong();
//            if (a == 0 && b == 0) {
//                break;
//            }
//            System.out.println(calc(a, b));
//        }
//    }

//        Cách 2 : 
    private static long binpow(long a, long b) {
        if (b == 0) {
            return 1l;
        }
        long ans = binpow(a, b / 2);
        if (b % 2 == 0) {
            return (ans * ans) % MOD;
        } else {
            return (((ans * ans) % MOD) * a) % MOD;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(binpow(a, b));
        }
    }
}
