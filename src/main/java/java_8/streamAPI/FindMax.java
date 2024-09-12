package java_8.streamAPI;

import java.util.HashSet;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> list = List.of(34,2,23,-98,0,-1);
        System.out.println(list.stream().mapToInt(Integer::intValue).max().getAsInt());
        HashSet<Integer> hashSet = new HashSet<>();
    }
}
