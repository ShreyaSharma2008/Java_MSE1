// A College Event Registration System maintains the names of students registered for 7.5 2 3
// a technical event. A student should be registered only once.
// (a) Select a suitable Java Collection to store the names of registered students such
// that duplicate names are not allowed.
// (b) Add at least four students to the collection.
// (c) Display the total number of registered students using the size() method.
// (d) Remove one student from the collection.
// (e) Write a suitable loop to display all the registered student names.

// Answer:
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> registeredStudents = new HashSet<>();
        registeredStudents.add("Aarav");
        registeredStudents.add("Ananya");
        registeredStudents.add("Vivaan");
        registeredStudents.add("Diya");
        registeredStudents.add("Aarav");
        System.out.println("Total number of registered students: " + registeredStudents.size());
        registeredStudents.remove("Vivaan");
        System.out.println("List of Registered Students:");
        for (String student : registeredStudents) {
            System.out.println(student + " ");
        }
    }
}
