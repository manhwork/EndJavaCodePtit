/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contest;

import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author admin
 */
public class b2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            TreeMap<Character, Integer> treeMap = new TreeMap<>();
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    if (treeMap.containsKey(c)) {
                        treeMap.put(c, treeMap.get(c) + 1);
                    } else {
                        treeMap.put(c, 1);
                    }
                }
            }
            treeMap.forEach((k, v) -> {
                for (int i = 0; i < v; i++) {
                    System.out.print(k);
                }
            });
            System.out.print(treeMap.size());
            System.out.println();
        }
    }

}

//2
//AC2BEW3
//ACCBA10D2EW30
