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
public class J01018 {

    /**
     * @param args the command line arguments
     */
    static boolean check(String n) {
        for (int i = 0; i < n.length() - 1; i++) {
            if (Math.abs(n.charAt(i) - n.charAt(i + 1)) != 2) {
                return false;
            }
        }
        return true;
    }

    private static boolean check2(String n) {
        long tong = 0;
        for (char c : n.toCharArray()) {
            tong += Integer.parseInt(String.valueOf(c));
        }
        return tong % 10 == 0;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String n = sc.next();
            System.out.println(check(n) && check2(n) ? "YES" : "NO");
        }
    }

}

//3
//1353
//246864
//123435