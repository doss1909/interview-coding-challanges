package java8Coding;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Level4StreamCoding {

    public static void main(String[] args) {
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

        // 11. Find users from each city (group by city)
        userList.stream().collect(Collectors.groupingBy(u -> u.address.city));
        // 12. Find youngest user in each state
        userList.stream().collect(Collectors.groupingBy(u -> u.address.state, Collectors.minBy(Comparator.comparing(u -> u.age))));
        // 13. Convert to Map (id → user)
        Map<Integer, User> collect = userList.stream().collect(Collectors.toMap(u -> u.id, u -> u));
        // 14. Get users sorted by city then age
        userList.stream().sorted(Comparator.comparing(u))
    }
}
