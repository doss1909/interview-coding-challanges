package java8Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // 1. find maximum in a list
        System.out.println(list.stream().max(Integer::compareTo).orElse(0));
        /*// Using compare (static)
        int result1 = Integer.compare(5, 10); // -1

        // Using compareTo (instance)
        Integer a = 5, b = 10;
        int result2 = a.compareTo(b); // -1*/

        // 2. sum of the all elements in a list
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        System.out.println(list.stream().reduce(0, (a, b) -> a+b));
        //T result = stream.reduce(identity, accumulator, combiner);
        /*reduce() is used to combine all elements of a stream into a single result
        reduce() = "Take many → combine step-by-step → get one result"
        Sum
        int sum = list.stream().reduce(0, Integer::sum);
        Max
        int max = list.stream().reduce(Integer.MIN_VALUE, Integer::max);
        String Join
        String result = Stream.of("A", "B", "C")
                .reduce("", (a, b) -> a + b);
         When NOT to Use reduce()

        Sometimes reduce() is overkill:
        Use .sum() instead of reduce for numbers
        Use .collect() for complex objects (like lists, maps)*/
        /*// map -> Stream<Integer>
        Stream<Integer> s1 = list.stream().map(Integer::intValue);

        // mapToInt -> IntStream
        IntStream s2 = list.stream().mapToInt(Integer::intValue);
        int sum = s2.sum(); // works directly

        map keeps it as Stream<Integer> (boxed),
        while mapToInt converts to IntStream (primitive),
                which is more efficient and feature-rich for numeric operations.*/

        // 3. convert to upper case of each string in an array
        String names[] = {"yo", "man", "come", "on"};
        System.out.println(Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList()));

        // 4. sort list of integers ascending order
        List<Integer> numbersList = Arrays.asList(1,6,2,4,3,5,9,8,7,6);
        System.out.println(numbersList.stream().sorted(/*Integer::compareTo*/).collect(Collectors.toList()));
        /*List<Integer> list1 = Stream.of(1,2,3)
                .collect(Collectors.toList()); // mutable

        List<Integer> list2 = Stream.of(1,2,3)
                .toList(); // unmodifiable*/

        // 5. sort list of integers descending order
        System.out.println(numbersList.stream().sorted(Comparator.reverseOrder()).toList());
        /*      sort() → In-place operation on a List. It rearranges the elements of the existing list itself.

                sorted() → Stream operation. It returns a new sorted stream without modifying the original collection.


        List<Integer> list = Arrays.asList(5, 2, 9, 1);

        // sort() modifies the list directly
        list.sort(Comparator.naturalOrder());
        System.out.println(list); // [1, 2, 5, 9]

        // sorted() creates a new sorted stream
        List<Integer> sortedList = list.stream()
                .sorted()
                .toList();
        System.out.println(sortedList); // [1, 2, 5, 9]

👉       In short:

        sort() → mutates the list.

                sorted() → returns a new sorted view via streams.*/

        // 6. want employee first names only
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "abhisek", "sharma"));
        employeeList.add(new Employee(1, "rohit", "sharma"));

        System.out.println(employeeList.stream().map(Employee::getFirstName).toList());



    }
}
class Employee{
    int id;
    String firstName;
    String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
