package java_8.streamAPI;

//Here a list or a collection is checked for a given condition as a whole

import java.util.List;

public class CheckListAsWhole {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,6);
        System.out.println(list.stream().allMatch(i -> i%2 == 0));
    }
}
