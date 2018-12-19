import java.io.*;
import java.util.*;

//import static jdk.nashorn.internal.objects.Global.print;

public class hashMap {
    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();

        //print(map);
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        System.out.println("Size of map is:- " + map.size());
        System.out.println(map);
    }
}
