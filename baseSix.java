import java.util.Scanner;

public class baseSix {
    public static int baseSixGen(int base10Num) {
        int base6NumSum = 0, temp = base10Num;
        while (temp != 0) {
            int onesDigit = temp % 6;
            base6NumSum = base6NumSum + onesDigit;
            temp = temp / 6;
        }
        return base6NumSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String[] nums = sc.next().split(",");
        int[] baseTen = new int[n];
        int[] derivedSeq = new int[n];
        for (int i = 0; i < n; i++) {
            baseTen[i] = Integer.parseInt(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            derivedSeq[i] = baseSixGen(baseTen[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(derivedSeq[i] > derivedSeq[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();

    }
}
