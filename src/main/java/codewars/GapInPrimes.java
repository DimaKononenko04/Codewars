package codewars;

import java.util.ArrayList;
import java.util.List;

public class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        List<Integer> list = new ArrayList<>();
        for (int i = Math.toIntExact(m); i <= n; i++){
            if (i == 1 || i ==0){
                continue;
            }
            if(isPrimeNumber(i)){
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int first = list.get(i);
            int second = list.get(i+1 < list.size() ? i+1 : i);
            if(second - first == g){
                return new long[]{first, second};
            }
        }
        return null;
    }

    public static boolean isPrimeNumber(int number){
        for (int i = 2; i < number/2 ; ++i) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeNumber(long n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i != 0 && n % (i + 2) != 0) {
                continue;
            }
            return false;
        }

        return true;
    }
}
