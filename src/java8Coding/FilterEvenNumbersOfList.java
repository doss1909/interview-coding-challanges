package java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbersOfList {

    public static void main(String[] args) {
        List<Integer> list = /*new ArrayList<>();*/ Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> result = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }
}
