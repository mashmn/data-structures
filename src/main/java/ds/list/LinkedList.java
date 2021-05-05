package ds.list;

public class LinkedList<T> {
    /**
     * The head of the Linked List - the first node.
     */
    public Node<T> head;

    public static class Node<T> {
        T data;
        Node<T> next;

        Node(T d) {
            data = d;
            next = null;
        }
    }

    /**
     * Add a node to the beginning of the Linked List (head)
     * @param newData new data
     */
    public void updateFirst (T newData) {
        Node<T> newHeadNode = new Node<>(newData);
        newHeadNode.next = head;

        head = newHeadNode;
    }

    /**
     *
     * @param key delete the first node with the key
     */
    public void delete (T key) {
        Node<T> temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        // clear the l
        prev.next = temp.next;
    }

    /**
     * Add a node between the Linked List
     * @param previousNode previous node after which a node is to be added
     * @param newData new data
     */
    public void add (Node<T> previousNode, T newData) {
        if (previousNode == null) {
            System.out.println("The given Node cannot be null");
            return;
        }

        Node<T> newNode = new Node<>(newData);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }

    /**
     * Add a node to the end of the Linked List
     * @param newData new data
     */
    public void add(T newData) {
        Node<T> newNode = new Node<>(newData);

        if(head == null) {
            head = new Node<>(newData);
            return;
        }

        newNode.next = null;
        Node<T> last = head;

        while(last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    /**
     * Reverse a Linked List
     */
    public void reverse() {
        // 1->2->3->null ------ null<-1<-2<-3
        Node<T> previous = null;
        Node<T> current = head;
        Node<T> next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    /**
     * Prints the Linked List in order from head to tail
     */
    public void printer() {
        Node<T> n = head;

        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
        System.out.println("\n");
    }
}