package others;


import java.util.ArrayList;
import java.util.List;

final class Student1{

    private final int id;
    private final String name;
    private final List<String> courses;

    Student1(int id, String name,List<String> courses){
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
        Student1 s1 = new Student1(1, "aadi", List.of("java", "python"));

        System.out.println(s1);
    }
}
