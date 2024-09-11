package java_8.streamAPI;

import java.util.List;

//Q. Find the strings starting with specific character

public class StringStartingWith {
    public static void main(String[] args) {
        List<String> list = List.of("Hello","How","Do","You","Do","Howdie");
        list.stream().filter(s -> s.startsWith("H")).forEach(System.out::println);
    }
}
