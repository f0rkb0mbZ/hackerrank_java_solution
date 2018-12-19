import java.util.ArrayList;
import java.util.Scanner;

public class strToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        int count = 0;
        ArrayList<String> splitstrarr = new ArrayList<>();
        for (String splitstr : s.split("[ !,?._'@]+")) {
            if (!splitstr.equals("")) {
                splitstrarr.add(splitstr);
                count++;
            }
        }
        System.out.println(count);
        for (String tokens : splitstrarr) {
            System.out.println(tokens);
        }

        scan.close();
    }
}