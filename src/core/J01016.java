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
public class J01016 {

    /**
     * @param args the command line arguments
     */
    static long countDigit(String n) {
        long cnt = 0;
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(countDigit(n) == 4l || countDigit(n) == 7l ? "YES" : "NO");
    }

}
