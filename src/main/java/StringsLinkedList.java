public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        if (first.next == null) {

            Node current = new Node();
            current.value = value;
            first.next = current;
            last.prev = first.next;


        } else {
            Node current = new Node();
            current.value = value;

         //   var pre = last.prev;
         //   pre.next = current;
         //   current.prev = pre;
         //   last.prev = current;

            (last.prev).next = current;
            current.prev = last.prev;
            last.prev = current;

            System.out.println(last.prev);
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
/*
if (first.next == null) {
        Node node = new Node();
        node.value = value;
        first.next = node;
        }
        if (last.prev == null) {
        last.prev = first.next;
        return;
        }


Node node = new Node();
        node.value = value;

                Node lastNode = last.prev;
                lastNode.next = node;
                node.prev = lastNode;
                last.prev = node;
*/
