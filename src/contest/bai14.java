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
public class bai14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double maxn = -1f;
        double minn = 1000000f;
        double result = 0;
        int cnt = 0;

        Double[] a = new Double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
            maxn = Double.max(a[i], maxn);
            minn = Double.min(minn, a[i]);
        }
        System.out.println(maxn);
        System.out.println(minn);
        for (int i = 0; i < n; i++) {
            if (a[i] != maxn && a[i] != minn) {
                result += a[i];
                cnt++;
            }
        }
        System.out.println(String.format("%.2f", result / cnt));
    }

}

//6
//6.75 8 9.2 7.25 7.75 6.75
