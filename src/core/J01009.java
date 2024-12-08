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
public class J01009 {

    /**
     * @param args the command line arguments
     */
    static long giaithua(long n) {
        long tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
        }
        return tich;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += giaithua(i);
        }
        System.out.println(tong);
    }

}
