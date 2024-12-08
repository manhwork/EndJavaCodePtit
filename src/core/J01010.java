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
public class J01010 {

    /**
     * @param args the command line arguments
     */
    static char catdoi(char c) {
        if (c == '0' || c == '9' || c == '8') {
            return '0';
        } else if (c == '1') {
            return '1';
        } else {
            return '2';
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String line = sc.next();
            boolean check = false;
            String tmp = "";
            for (char c : line.toCharArray()) {
                if (catdoi(c) == '2') {
                    check = true;
                    break;
                } else {
                    tmp += catdoi(c);
                }
            }
            if(check || Long.parseLong(tmp)== 0){
                System.out.println("INVALID");
            } else {
                System.out.println(Long.parseLong(tmp));
            }
        }
    }

}
