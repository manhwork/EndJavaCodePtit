/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class b1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] s = sc.nextLine().trim().split("\\s+");
            for (String x : s) {
                strings.add(x);
            }
        }
        Collections.sort(strings, (o1, o2) -> {
            return o2.length() - o1.length();
        });
        System.out.println(String.format("%s - %d", strings.get(0), strings.get(0).length()));
    }

}

//Lap trinh C++ Cau truc du lieu va giai do
//
