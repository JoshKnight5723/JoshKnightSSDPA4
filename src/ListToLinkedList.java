import java.util.LinkedList;
import java.util.List;

/**
 * Class to create and return a linked list resulting from TakeInput class list
 * @author Josh Knight
 * @version 1.0.0
 * @since 6/1/2024
 *
 */
public class ListToLinkedList {
    /**
     * createLinked method creates a linked list using
     * java.util.LinkedList built in methods
     * @return linked list of sorted integers
     * @since 6/1/2024
     */

    public LinkedList<Integer> createLinked() {
        TakeInput going = new TakeInput();
        LinkedList<Integer> list = new LinkedList<>();
        List<Integer> y = going.createList();
        for (int x = 0; x < y.size(); x++ ) {
            list.add(y.get(x));
        }
        return list;
    }
}
