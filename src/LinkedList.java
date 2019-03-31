public class LinkedList<T> {
    private Node head;

    public LinkedList(){
        head = null;
    }

    public void add(T value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new Node(value);
        }
    }

    public void remove(){
        if(head.next == null){
            head = null;
        } else {
            Node node = head;
            while (node.next.next != null){
                node = node.next;
            }
            node.next = null;
        }
    }

    public void remove(T value) {
        if (head.value == value) {
            head = head.next;
        } else {
            Node node = head;
            while (node.next != null && node.next.value != value) {
                node = node.next;
            }
            if(node.next.next == null){
                node.next = null;
            } else {
                node.next = node.next.next;
            }
        }
    }

    public void print(){
        if (head == null) {
            System.out.println("There are no values!");
        } else {
            System.out.print("The values are: " + head.value);
            Node node = head.next;
            while (node != null){
                System.out.print(" " + node.value);
                node = node.next;
            }
            System.out.println();
        }
    }

    /*

    TODO:

    contains(T)
    remove(index)
    get(index)
    set(index, T)

     */

    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
            next = null;
        }
    }

}
