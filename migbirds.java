//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class migbirds {
//
//    // Complete the migratoryBirds function below.
//    static int migratoryBirds(int[] ar) {
//        int n = ar.length;
//        int birdcount[] = new int[n];
//        for(int i = 0; i < n; i++){
//            birdcount[ar[i]]++;
//        }
//        int max = 0;
//        int maxpos = 0;
//        for(i = 0; i < n; i++){
//            if(birdcount[i] > max){
//                max = birdcount[i];
//                maxpos = i;
//            }
//        }
//        return maxpos;
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[arCount];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < arCount; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//
//        int result = migratoryBirds(ar);
//
////        bufferedWriter.write(String.valueOf(result));
////        bufferedWriter.newLine();
////
////        bufferedWriter.close();
//        System.out.println(result);
//        scanner.close();
//    }
//}