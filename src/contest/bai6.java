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
public class bai6 {

    /**
     * @param args the command line arguments
     */
    private static String chuanhoa(String s) {
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        return s;
    }

    private static String cach1(String[] tokens) {
        String tmp = tokens[tokens.length - 1] + " ";
        for (int i = 0; i < tokens.length - 1; i++) {
            tmp += tokens[i] + " ";
        }
        return tmp;
    }

    private static String cach2(String[] tokens) {
        String tmp = "";
        for (int i = 1; i < tokens.length ; i++) {
            tmp += tokens[i] + " ";
        }
        return tmp + tokens[0];
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] tokens = sc.nextLine().toLowerCase().trim().split("\\s+");
            for (int i = 0; i < tokens.length; i++) {
                tokens[i] = chuanhoa(tokens[i]);
            }
            if (n == 1) {
                System.out.println(cach1(tokens));
            } else {
                System.out.println(cach2(tokens));
            }
        }
    }

}
//2
//1
//NguyeN    vAn    Nam
//2
//hoAng  le Nhat THONG chi
