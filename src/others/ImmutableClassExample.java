package others;


import java.util.ArrayList;
import java.util.List;

final class Student{
    private final int id;
    private final String name;
    private final List<String> courses;

    Student(int id, String name,List<String> courses){
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<String>(courses);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}

public class ImmutableClassExample {

    public static void main(String[] args) {
        Student s1 = new Student(1, "aadi", List.of("java", "python"));
        
        System.out.println(s1);
    }
}
