package java8Coding;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserObjectStreams {

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

        // 1. Get all user names
        System.out.println(userList.stream().map(user -> user.getFirstName()+" "+user.getLastName()).toList());
        // 2. Filter users with age > 30
        System.out.println(userList.stream().filter(user -> user.getAge() > 30).toList());
        // 3. Get all cities
        System.out.println(userList.stream().map(user -> user.address.city).distinct().toList());
        // 4. Count users in a specific state (e.g., Maharashtra)
        System.out.println(userList.stream().filter(u -> u.address.city.equals("Hyderabad")).count());
        // 5. Sort users by age
        System.out.println(userList.stream().sorted(Comparator.comparing(u -> u.age)).toList());
        // 6. Get oldest user
        System.out.println(userList.stream().max(Comparator.comparing(u -> u.age)).orElse(null));
        // 8. Group users by state
        System.out.println(userList.stream().collect(Collectors.groupingBy(u -> u.address.state)));
        //9. Count users by state
        System.out.println(userList.stream().collect(Collectors.groupingBy(u -> u.address.state, Collectors.counting())));
        // 10. Average age of users
        System.out.println(userList.stream().collect(Collectors.averagingDouble(u -> u.age)));
    }
}

class User{

    Integer id;
    String firstName;
    String lastName;
    Long age;
    Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User(Integer id, String firstName, String lastName, Long age, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

class Address{
    String city;
    String state;
    Integer pincode;

    public Address(String city, String state, Integer pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    /*public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Integer getPincode() {
        return pincode;
    }*/
}