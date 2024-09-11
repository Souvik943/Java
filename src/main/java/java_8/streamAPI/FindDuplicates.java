package java_8.streamAPI;

//Q. How to find duplicate elements in a given integers list in java using Stream functions?

import java.util.HashSet;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,1,1,4,3,4,2);
//        list.stream().distinct().forEach(System.out::println);
        HashSet<Integer> hashSet = new HashSet<>();
        list.stream().filter(i -> !hashSet.add(i)).forEach(System.out::println);
    }
}
