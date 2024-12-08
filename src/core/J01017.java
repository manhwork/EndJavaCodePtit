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
public class J01017 {

    /**
     * @param args the command line arguments
     */
    static String check(String n) {
        for (int i = 0; i < n.length() - 1; i++) {
            if (Math.abs(n.charAt(i) - n.charAt(i + 1)) != 1) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String n = sc.next();
            System.out.println(check(n));
        }
    }

}
