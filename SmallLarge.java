import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SmallLarge {

    public static String getSmallestAndLargest(String s, int k) {
        if (s.length() != k) {
            StringBuilder smallest = new StringBuilder();
            StringBuilder largest = new StringBuilder();
            for (int itr = 0; itr < k; itr++) {
                smallest.append("z");
                largest.append("a");
            }
            String large = largest.toString();
            String small = smallest.toString();
            for (int i = 0; i <= s.length() - k; i++) {
                String substr = s.substring(i, i + k).toLowerCase();
                //System.out.println(substr);
                if (substr.compareTo(large) > 0) {
                    large = substr;
                } else if (substr.compareTo(small) < 0) {
                    small = substr;
                }
            }
            return small + "\n" + large;
        }
        else{
            return s;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}