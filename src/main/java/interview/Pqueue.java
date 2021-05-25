package interview;

import java.util.PriorityQueue;
import java.util.Queue;

public class Pqueue<S> {
    public static void main (String[] args) {
        Queue<String> pQ = new PriorityQueue<>();
        pQ.add("D");
        pQ.add("A");
        pQ.add("C");

        System.out.println("stuff in priority queue" + pQ);

        // polling extracts the content in natural order
        while (!pQ.isEmpty()) {
            System.out.println(pQ.poll());
        }
    }
}
