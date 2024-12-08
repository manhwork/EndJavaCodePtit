package contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.TreeSet;

public class b11 {

    // Phương thức kiểm tra thời gian hợp lệ
    private static boolean isValidTime(String time, SimpleDateFormat sdf) {
        try {
            sdf.parse(time);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("C:\\Users\\admin\\Documents\\GitHub\\EndJavaCodePtit\\src\\contest\\DATA.txt"));
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//        sdf.setLenient(false); // Không cho phép lenient parsing
        
        TreeSet<String> timeSet = new TreeSet<>();
        
        while (sc.hasNextLine()) {
            
            String[] tokens = sc.nextLine().trim().split("[\\s.,]+");
            
            for (String token : tokens) {
                if (token.length() == 8 && isValidTime(token, sdf)) {
                    timeSet.add(token);
                }
            }
        }
        
        for (String time : timeSet) {
            System.out.println(time);
        }
        
    }
}
