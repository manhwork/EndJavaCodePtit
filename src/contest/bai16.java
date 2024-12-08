package contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class bai16 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner((new File("C:\\Users\\admin\\Documents\\GitHub\\EndJavaCodePtit\\src\\contest\\DATA.txt")));
        BigInteger tong = new BigInteger("0");
        
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                long num = Long.parseLong(s);

                if (num > Integer.MAX_VALUE && num <= Long.MAX_VALUE) {
                    tong = tong.add(BigInteger.valueOf(num));

                }
            } catch (Exception e) {
            }
        }
        System.out.println(tong);
    }

}
