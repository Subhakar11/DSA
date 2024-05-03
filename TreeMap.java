import java.util.*;
public class TreeMap {
    public static void main(String args[]) {
        TreeMap<String , Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("China", 167);
        tm.put("Indonesia", 34);
        tm.put("Russia", 56);
    HashMap<String,Integer> hm = new HashMap<>();

    hm.put("India", 100);
    hm.put("China", 167);
    hm.put("Indonesia", 34);
    hm.put("Russia", 56);
        System.out.print(hm);
        System.out.println();
        System.out.print(tm);
    }
}
