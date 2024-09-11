package java_8.streamAPI;

import java.util.List;

//Q.Given a list of integers, find out all the numbers starting with 1 using Stream functions?

public class NumStartingWith {

    public static void main(String[] args) {
        List<Integer> list = List.of(123,67,-1,87,1,11,342);
        list.stream().map(s -> s + "").filter(i -> i.startsWith("1")).forEach(System.out::println);
    }
}
