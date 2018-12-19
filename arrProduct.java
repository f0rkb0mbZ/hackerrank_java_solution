//import java.util.Scanner;
//
//
//public class arrProduct {
//    static int helper(int[] factor, int[] subset, int index) {
//        if (index == factor.length) {
//
//        } else {
//            subset[index] = 0;
//            helper(factor, subset, index + 1);
//            subset[index] = factor[index];
//        }
//    }
//
//    static int factors(int multiple, int k) {
//        int count = 0;
//        int[] factorArr;
//        for (int i = 1; i <= multiple; i++) {
//            if (multiple % i == 0) {
//                factorArr[count] = i;
//                count++;
//            }
//        }
//        int[] subset = new int[factorArr.length];
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] numArr = new int[n];
//        for (int i = 0; i < n; i++) {
//            numArr[i] = sc.nextInt();
//        }
//        int multiple = 1;
//        for (int i = 0; i < n; i++) {
//            multiple = multiple * numArr[i];
//        }
//        int result = factors(multiple, k);
//        System.out.println(result);
//    }
//}
