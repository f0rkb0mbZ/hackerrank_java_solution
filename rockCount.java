import java.util.Scanner;

public class rockCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int r = in.nextInt();
        int count = 0;
        int[] rocks = new int[s];
        int[] results = new int[r];
        for (int i = 0; i < s; i++) {
            rocks[i] = in.nextInt();
        }
        int[] ranges = new int[2 * r];
        for (int i = 0; i < 2 * r; i++) {
            ranges[i] = in.nextInt();
        }
        for (int i = 0; i < 2*r; i = i + 2) {
            for (int j = 0; j < s; j++) {
                if (rocks[j] >= ranges[i] && rocks[j] <= ranges[i + 1]) {
                    results[count]++;
                }
            }
            count++;
        }
        for (int i = 0; i < r; i++) {
            System.out.println(results[i]);
        }
    }
}
