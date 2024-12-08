/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            ArrayList<String> tokenList = new ArrayList<>();
            String[] token = sc.nextLine().trim().split("\\s+");
            for (String x : token) {
                tokenList.add(x);
            }
            for (int i = tokenList.size() - 1; i >= 0; i--) {
                System.out.print(tokenList.get(i) + " ");
            }
            System.out.println();
        }
    }

}

//2
//I like this program very much
//much very program this like I
