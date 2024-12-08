/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contest;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String n = sc.nextLine();
            long tich = 1l;
            long tong = 0l;
            for (int i = 0; i < n.length(); i++) {
                if (i % 2 == 0) {
                    if (n.charAt(i) != '0') {
                        tich *= n.charAt(i) - '0';
                    }
                } else {
                    tong += n.charAt(i) - '0';
                }
            }
            System.out.println(tich + " " + tong);
        }
    }

}

//3
//12345678
//20000
//22334455667788