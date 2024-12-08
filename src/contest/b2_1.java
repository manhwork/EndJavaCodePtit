/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contest;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class b2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int[] a = new int[30];
            int cnt = 0;
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    a[c - 'A']++;
                } else if (Character.isDigit(c)) {
                    cnt += c - '0';
                }
            }
            for (int i = 0; i < 30; i++) {
                if (a[i] != 0) {
                    for (int j = 0; j < a[i]; j++) {
                        System.out.print((char) (i + 'A'));
                    }
                }
            }
            System.out.print(cnt);
            System.out.println();
        }
    }

}
