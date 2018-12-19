import java.util.Scanner;

public class hourGlass {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if((i > 0 && j > 0) && (i < 5 && j < 5)){
                    int sum = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i][j] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                    if(sum > maxSum){
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);
        scanner.close();
    }
}
