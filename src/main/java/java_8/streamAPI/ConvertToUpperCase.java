package java_8.streamAPI;

//Q. Convert given list of strings to upper case

import java.util.List;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> list = List.of("hello","my","name","is","souvik");
        list.stream().filter(s -> s.startsWith("h")).map(s -> s.toUpperCase()).forEach(System.out::print);
    }
}
