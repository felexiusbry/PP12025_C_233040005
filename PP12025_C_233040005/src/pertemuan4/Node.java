package pertemuan4;

public class Node {
    private int data;
    private Node next;

    /** Inisialisasi atribut node
     * @param data */
    public Node(int data) {
        this.data = data;
        this.next = null; // Default next adalah null
    }

    /** Setter untuk data
     * @param data */
    public void setData(int data) {
        this.data = data;
    }

    /** Getter untuk data
     * @return  */
    public int getData() {
        return data;
    }

    /** Setter untuk next
     * @param next */
    public void setNext(Node next) {
        this.next = next;
    }

    /** Getter untuk next
     * @return  */
    public Node getNext() {
        return next;
    }
}