//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class distinctPartitions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> list = new
//        StringTokenizer str = new StringTokenizer(sc.next(), ",");
//        int n = Integer.parseInt(str.nextToken());
//        int k = Integer.parseInt(str.nextToken());
//        int count = 0;
//        System.out.println(n);
//        System.out.println(k);
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                for (int l = j+1; l < n; l++) {
//                    if(i+j+l == n){
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//
//    }
//}
