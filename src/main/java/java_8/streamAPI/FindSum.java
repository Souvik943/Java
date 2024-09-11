package java_8.streamAPI;

import java.util.List;

//Q.Find sum of all the elements
public class FindSum {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7);
        System.out.println(nums.stream().mapToInt(Integer::intValue).sum());
    }
}
