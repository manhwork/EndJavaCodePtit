/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package core;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J01012 {

    static ArrayList<Integer> uocList(int n) {
        ArrayList<Integer> uocArrayList = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i != n / i) {
                    uocArrayList.add(i);
                    uocArrayList.add(n / i);
                } else {
                    uocArrayList.add(i);
                }
            }
        }
        return uocArrayList;
    }

    static int count(ArrayList<Integer> uocList) {
        int cnt = 0;
        for (Integer integer : uocList) {
            if (integer % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            
        int n = sc.nextInt();
            System.out.println(count(uocList(n)));
        }
    }

}
