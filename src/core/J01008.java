
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J01008 {

    static Map<Long, Long> ptich(long n) {
        Map<Long, Long> map = new LinkedHashMap<>();
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                long cnt = 0;
                while (n % i == 0) {
                    cnt++;
                    n /= i;
                }
                map.put(i, cnt);
            }
        }
        if (n != 1) {
            map.put(n, 1l);
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Long.parseLong(sc.nextLine());

        for (long i = 1; i <= t; i++) {
            long n = Long.parseLong(sc.nextLine());
            System.out.print(String.format("Test %d: ", i));
            ptich(n).forEach((k, v) -> {
                System.out.print(String.format("%d(%d) ", k, v));
            });
            System.out.println();
        }
    }
}
