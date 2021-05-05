package ds.list;

public class LinkedListImplement {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("2");
        linkedList.add("hi");
        linkedList.add("4");
        linkedList.updateFirst("0");
        linkedList.add(linkedList.head.next, "99");
        linkedList.delete("4");
        linkedList.printer();

        linkedList.reverse();
        linkedList.printer();
    }
}