package pertemuan2;

public class Node {
	private final int nilai;
	private Node next;

	public Node(int nilai) {
	    this.nilai = nilai;
	    this.next = null;
	}

	public int getNilai () {
		return nilai;
	}
	
	public Node getNext () {
		return next;
	}
	
	public void setNext (Node next) {
		this.next = next;
	}
}