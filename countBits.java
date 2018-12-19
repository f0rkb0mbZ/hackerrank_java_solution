import java.util.Scanner;

public class countBits {
    public static int countOnes(int number) {
        int count = 0;
        while (number > 0) {
            ++count;
            number &= number - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        String num = sc.next();
        String[] nums = num.split(",");
        int[] numArr = new int[n];
        int[] derivedSeq = new int[n];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            derivedSeq[i] = countOnes(numArr[i]);
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
