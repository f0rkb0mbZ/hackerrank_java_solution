import java.util.Scanner;

public class greatChase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] i = new int[t];
        int[] d = new int[t];
        int[] z = new int[t];
        int[] leap = new int[t];
        int zandspeed = 0;
        int start = 0;
        for (int j = 0; j < t; j++) {
            i[j] = sc.nextInt();
            d[j] = sc.nextInt();
            z[j] = sc.nextInt();
        }
        for (int j = 0; j < t; j++) {
            start = i[j];
            zandspeed = z[j];
            while (start % zandspeed != 0) {

                leap[j] = start / z[j];

                start = start + d[j];
            }
        }
        for (int j = 0; j < t; j++) {
            System.out.println(leap[j]+1);
        }
    }
}
