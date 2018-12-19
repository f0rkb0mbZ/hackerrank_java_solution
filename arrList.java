import java.util.ArrayList;
import java.util.Scanner;

public class arrList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d, q, x, y;
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            d = in.nextInt();
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                row.add(in.nextInt());
            }
            rows.add(row);
        }
        q = in.nextInt();

        for (int i = 0; i < q; i++){
            x = in.nextInt();
            y = in.nextInt();

            try{
                System.out.println(rows.get(x-1).get(y-1));
            } catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
