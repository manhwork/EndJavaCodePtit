/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author admin
 */
public class bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            LinkedHashMap<Long, Integer> countTreeMap = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (countTreeMap.containsKey(a[i])) {
                    countTreeMap.put(a[i], countTreeMap.get(a[i]) + 1);
                } else {
                    countTreeMap.put(a[i], 1);
                }
            }
            ArrayList<Map.Entry<Long, Integer>> al = new ArrayList<>(countTreeMap.entrySet());
            al.sort((o1, o2) -> {
                return o2.getValue() - o1.getValue();
            });

            al.forEach((item) -> {
                for (int i = 0; i < item.getValue(); i++) {
                    System.out.print(item.getKey() + " ");
                }
            });
            System.out.println();
        }
    }

}
