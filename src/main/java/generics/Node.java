package generics;

import org.w3c.dom.traversal.NodeIterator;

import java.util.Iterator;

public class Node  implements Iterable<Node> {
    private int data;
    private Node next;
    public  Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public Iterator<Node> iterator(){
        return new NodeIterator(this);
    }
    private static class NodeIterator implements Iterator<Node> {
        private Node current;

        public NodeIterator(Node head) {
            this.current = head;
        }
        @Override
        public boolean hasNext() {
            return current != null;
        }
        @Override
        public Node next() {
            Node node = current;
            current = current.next;
            return node;
        }
    }
}

