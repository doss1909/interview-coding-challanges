package others;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public record StudentRecord(int id, String name, List<String> courses) {

    // 1. The Compact Constructor
    // This runs before the fields are assigned.
    // We can modify the parameters here before they are saved.
    public StudentRecord {
        // DEFENSIVE COPY on INPUT
        // We create a new list containing the elements.
        // Ideally, we make it unmodifiable immediately.
        courses = List.copyOf(courses);
        // Note: List.copyOf (Java 10+) creates an unmodifiable copy.
        // Alternative: courses = Collections.unmodifiableList(new ArrayList<>(courses));
    }

    // 2. Getter is automatically generated, but...
    // Since we used List.copyOf in the constructor, the internal list
    // is ALREADY unmodifiable. We don't strictly need to override the getter.

    // However, if we didn't use List.copyOf (e.g., if we just did 'new ArrayList<>()'),
    // we would need to override the getter to return a copy or unmodifiable view:

    /*
    @Override
    public List<String> courses() {
        return new ArrayList<>(courses); // Return a copy
    }
    */
}