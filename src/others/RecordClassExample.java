package others;


import java.util.ArrayList;
import java.util.List;

public class RecordClassExample {
    public static void main(String[] args) {
        List<String> myCourses = new ArrayList<>();
        myCourses.add("Math");

        StudentRecord student = new StudentRecord(1, "John", myCourses);

        System.out.println(student); // Output: StudentRecord[id=1, name=John, courses=[Math]]

        // Attempt 1: Modify the original list passed to constructor
        myCourses.add("Hacking");
        System.out.println(student); // Output: StudentRecord[id=1, name=John, courses=[Math]]
        // Result: Safe! The record has its own copy.

        // Attempt 2: Modify the list retrieved from the getter
        List<String> retrievedCourses = student.courses();

        try {
            retrievedCourses.add("Science");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify! List is unmodifiable.");
        }
        // Result: Safe! List.copyOf returns an unmodifiable list.
    }
}