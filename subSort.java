import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class subSort {

    public static String getSmallestAndLargest(String s, int k) {
        ArrayList<String> substrarr = new ArrayList<String>();


        for (int i = 0; i <= s.length() - k; i++) {
            String substr = s.substring(i, i + k);
            substrarr.add(substr);
            //System.out.println(substr);
        }
        Collections.sort(substrarr);
        String small = substrarr.get(0);
        String large = substrarr.get(substrarr.size() - 1);
        return small + "\n" + large;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}