package java8Coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Level2StreamAPICoding {

    public static void main(String[] args) {

        // 1. Flatten a List<List<Integer>> into a single List<Integer>
        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));
        System.out.println(nestedList.stream().flatMap(Collection::stream).toList());

        List<User> userList = List.of(
                new User(1, "Amit", "Sharma", 28L, new Address("Bangalore", "Karnataka", 560001)),
                new User(2, "Priya", "Verma", 24L, new Address("Mumbai", "Maharashtra", 400001)),
                new User(3, "Rahul", "Kumar", 30L, new Address("Delhi", "Delhi", 110001)),
                new User(4, "Sneha", "Reddy", 26L, new Address("Hyderabad", "Telangana", 500001)),
                new User(5, "Vikram", "Singh", 35L, new Address("Jaipur", "Rajasthan", 302001)),
                new User(6, "Neha", "Patel", 27L, new Address("Ahmedabad", "Gujarat", 380001)),
                new User(7, "Arjun", "Nair", 29L, new Address("Kochi", "Kerala", 682001)),
                new User(8, "Pooja", "Das", 23L, new Address("Kolkata", "West Bengal", 700001)),
                new User(9, "Karan", "Mehta", 31L, new Address("Pune", "Maharashtra", 411001)),
                new User(10, "Anjali", "Yadav", 25L, new Address("Lucknow", "Uttar Pradesh", 226001))
        );
        // 2. Group users by age into Map<Integer, List<User>>
        System.out.println(userList.stream().collect(Collectors.groupingBy(/*User::getAge*/user -> user.age)));

        // 3. Find all numbers whose string representation starts with '1'
        List<Integer> numbers = Arrays.asList(10, 25, 100, 321);
        System.out.println(numbers.stream().filter(num -> String.valueOf(num).startsWith("1")).toList());

        // 4. Find all IDs that appear more than once (duplicates)
        numbers = Arrays.asList(1, 2, 1, 3, 4, 3);
        List<Integer> resultList =numbers.stream().collect(Collectors.groupingBy(u -> u, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).toList();

        System.out.println(resultList);

        // 5. Find the first non-repeated character in a String
        String input1 = "helen kellar";
        char resultChar = input1.chars().mapToObj(ch -> (char)ch).filter(ch -> input1.indexOf(ch) == input1.lastIndexOf(ch)).findFirst().orElse(null);
        System.out.println(resultChar);

        // 7. Cube each price (price³) and then filter only those prices greater than 50
        List<Integer> prices = Arrays.asList(2, 3, 4); // Cubes: 8, 27, 64
        System.out.println(prices.stream().map(e -> Math.pow(e, 3)).filter(e -> e > 50).toList());

        // 8. Count how many times each word appears
        List<String> words = Arrays.asList("apple", "banana", "apple");
        System.out.println(words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        // 9. Find only those product names that are duplicates along with their count
        List<String> products = Arrays.asList("A", "B", "A", "C", "C", "D", "A");
        System.out.println(products.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));

        // 10. Safely check if a List<Object> is non-empty and then print each element
        products = Arrays.asList("A", "B", "A", null, "C", null, "D", "A");
        products.forEach(System.out::print);
        System.out.println();
        Optional.ofNullable(products)
                .filter(p -> !p.isEmpty())
                .ifPresent(System.out::print);


    }
}
