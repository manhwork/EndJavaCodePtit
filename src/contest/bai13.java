/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, Long> hm = new HashMap<>();
        while (t-- > 0) {
            SimpleDateFormat sdf_day = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdf_hour = new SimpleDateFormat("HH:mm:ss");
            String name = sc.nextLine();
            String[] line1 = sc.nextLine().trim().split("[\\s+]");
            Date dateStart = sdf_day.parse(line1[0]);
            Date hourStart = sdf_hour.parse(line1[1]);
            String[] line2 = sc.nextLine().trim().split("[\\s+]");
            Date dateEnd = sdf_day.parse(line2[0]);
            Date hourEnd = sdf_hour.parse(line2[1]);
            long time = ((dateEnd.getTime() - dateStart.getTime()) / (1000 * 60) + (hourEnd.getTime() - hourStart.getTime()) / (1000 * 60));
            hm.put(name, time);
        }
        ArrayList<Map.Entry<String, Long>> al = new ArrayList<>(hm.entrySet());
        al.sort((o1, o2) -> {
            if (!o1.getValue().equals(o2.getValue())) {
                return o2.getValue().compareTo(o1.getValue());
            }

            return o1.getKey().compareTo(o2.getKey());
        });
        al.forEach(item -> {
            System.out.println(item.getKey() + " " + item.getValue());
        });
    }

}
//3
//Do Viet Anh
//11/12/2021 16:35:00
//11/12/2021 17:35:00
//Le Tuan Anh
//11/12/2021 16:45:00
//11/12/2021 18:15:00
//Nguyen Tuan Anh
//11/12/2021 17:00:00
//11/12/2021 19:15:00
