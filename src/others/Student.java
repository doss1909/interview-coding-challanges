package others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Rule 1: Make class final
public final class Student {

    // Rule 2: Make fields private and final
    private final int id;
    private final String name;
    private final List<String> courses; // Mutable field

    // Constructor
    public Student(int id, String name, List<String> courses) {
        this.id = id;
        this.name = name;

        // Rule 4: Deep Copy for Mutable objects
        // We create a new ArrayList containing the elements of the passed list.
        // This ensures that if the caller modifies the 'courses' list passed in,
        // our internal state remains unchanged.
        this.courses = new ArrayList<>(courses);
    }

    // No Setters (Rule 3)

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Rule 5: Return a copy (Clone) of the mutable object
    public List<String> getCourses() {
        // Option A: Return a new ArrayList (Deep Copy in getter)
        // return new ArrayList<>(courses);

        // Option B: Return an unmodifiable view (preferred if you just want read-only)
        return Collections.unmodifiableList(courses);
    }

    // Optional: toString method for display
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", courses=" + courses + "]";
    }
}