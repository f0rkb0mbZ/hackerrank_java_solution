import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {

        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();

        char[] strA = a.toLowerCase().toCharArray();
        char[] strB = b.toLowerCase().toCharArray();

        for(char c : strA){
            if(mapA.containsKey(c)){
                mapA.put(c, mapA.get(c)+1);
            }
            else{
                mapA.put(c, 1);
            }
        }
        for(char c : strB){
            if(mapB.containsKey(c)){
                mapB.put(c, mapB.get(c)+1);
            }
            else{
                mapB.put(c, 1);
            }
        }
        if(mapA.equals(mapB)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}