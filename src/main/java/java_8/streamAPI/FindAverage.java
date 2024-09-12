package java_8.streamAPI;

import java.util.List;

public class FindAverage {
    public static void main(String[] args) {
        List<Double> list = List.of(1.2,3.2,34.2,56.1);
        System.out.println(list.stream().mapToDouble(Double::doubleValue).average().getAsDouble());
    }
}
