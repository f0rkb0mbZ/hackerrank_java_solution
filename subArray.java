import java.util.Scanner;

public class subArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int negcount = 0;
        for (int i = 0; i < n; i++){
            int subSum = 0;
            for (int j = i; j < n; j++){
                subSum += arr[j];
                if(subSum < 0){
                    negcount++;
                }
            }
        }
        System.out.println(negcount);
    }
}