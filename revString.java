import java.io.*;
import java.util.*;

public class revString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        StringBuilder revstring = new StringBuilder(A);
        if(revstring.reverse().toString().compareTo(A) == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



