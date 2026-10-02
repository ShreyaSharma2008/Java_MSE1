// A museum maintains a list of rare artifacts currently displayed in an exhibition. New 5 2 3
// artifacts can be added, and an artifact may be removed when it is sent for
// restoration. The museum uses a LinkedList to manage this dynamic list.
// (a) Create a LinkedList to store artifact names.
// (b) Add three artifact names to the list.
// (c) Add one new artifact at the beginning of the list.
// (d) Remove one artifact from the list and display the updated list.
// (e) Display the first and last artifact in the list.


  // ANSWER:
import java.util.LinkedList;
class ArtifactTracker{
    public static void main(String[] args){
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.addFirst("D");
        l1.remove();
        System.out.println(l1);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
    }
}
