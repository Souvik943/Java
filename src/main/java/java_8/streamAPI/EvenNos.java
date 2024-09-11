package java_8.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

//Q. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

public class EvenNos {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(getValidElements(list));
    }

    static List<Integer> getValidElements(List<Integer> list) {
        return list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
    }
}
