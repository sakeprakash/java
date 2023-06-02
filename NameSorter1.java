import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameSorter {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("davider");
        names.add("Charlie");
        names.add("David");
        names.add("afreen");

        System.out.println("Original list of names: " + names);

        // Sort the list in ascending order
        Collections.sort(names);

        System.out.println("Sorted list of names in ascending order: " + names);
    }
}