import com.dataStructure.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insertAtFront(5);
        list.print();
        list.insertAtFront(10);
        list.print();
        list.insertFromBack(25);
        list.print();
        list.insertAtFront(30);
        list.print();

        list.removeAtFront();
        list.print();
        list.removeFromBack();
        list.print();

    }
}