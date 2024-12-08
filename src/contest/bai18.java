package contest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class bai18 {

    private static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream data = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> p = (ArrayList<Integer>) data.readObject();
        for (int x : p) {
            if (snt(x) && String.valueOf(x).length() == 3) {
                System.out.println(x);
            }
        }
    }

}
