package contest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class bai17 {

    private static String convert(String s) {
        String tmp = "";
        for (char c : s.toCharArray()) {
            if (c == '1' || c == '0') {
                tmp += c;
            }
        }
        return tmp;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream data = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> p = (ArrayList<String>) data.readObject();
        for (String x : p) {
            System.out.println(convert(x) + " " + Integer.parseInt(convert(x), 2));
        }
    }

}
