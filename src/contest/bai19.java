package contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class bai19 {

    private static String convert(String[] names) {
        String result = names[names.length - 1];
        for (int i = 0; i < names.length - 1; i++) {
            result += names[i].charAt(0);
        }
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\admin\\Documents\\GitHub\\EndJavaCodePtit\\src\\contest\\DANHSACH.in"));
        HashSet<String[]> nameList = new HashSet<>();
        LinkedHashMap<String, Integer> v = new LinkedHashMap<>();
        while (sc.hasNextLine()) {
            String[] names = sc.nextLine().trim().toLowerCase().split("\\s+");
            String name = "";
            for(String x : names){
                name+=x + " ";
            }
            System.out.println(name);
            nameList.add(names);
        }
        System.out.println(nameList);
        nameList.forEach(item -> {
            String key = convert(item);
            if (v.containsKey(key)) {
                v.put(key, v.get(key) + 1);
            } else {
                v.put(key, 1);
            }
        });
        System.out.println(v);
    }

}
