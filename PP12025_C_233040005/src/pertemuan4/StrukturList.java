package pertemuan4;

public class StrukturList { 
    private Node head; // Atribut head untuk menunjuk ke awal list

    // Constructor untuk inisialisasi list kosong
    public StrukturList() {
        this.head = null;
    }

    // Fungsi untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Fungsi addHead untuk menambahkan elemen di awal list
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (!isEmpty()) {
            newNode.setNext(head);
        }
        head = newNode;
    }

    // Fungsi addTail untuk menambahkan elemen di akhir list
    public void addTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    // Fungsi addMid untuk menambahkan elemen di posisi tertentu
    public void addMid(int data, int position) {
        Node newNode = new Node(data);

        // Jika posisi 0, tambahkan di awal
        if (position == 0) {
            addHead(data);
            return;
        }

        Node curNode = head;
        int count = 0;

        // Pindah ke node sebelum posisi yang diinginkan
        while (curNode != null && count < position - 1) {
            curNode = curNode.getNext();
            count++;
        }

        // Jika posisi melebihi panjang list, tambahkan di akhir
        if (curNode == null) {
            System.out.println("Posisi di luar batas, menambahkan di akhir.");
            addTail(data);
            return;
        }

        // Sisipkan node baru di posisi yang diinginkan
        newNode.setNext(curNode.getNext());
        curNode.setNext(newNode);
    }

    // Fungsi untuk menampilkan elemen-elemen dalam list
    public void displayElement() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " "); // Menampilkan data node
            temp = temp.getNext();
        }
        System.out.println(); // Pindah baris setelah menampilkan semua elemen
    }

    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Contoh penggunaan addMid
        list.addTail(10);
        list.addTail(20);
        list.addTail(40);
        list.displayElement(); // Output: 10 20 40

        list.addMid(30, 2); // Menambahkan 30 di posisi ke-2
        list.displayElement(); // Output: 10 20 30 40

        list.addMid(5, 0); // Menambahkan 5 di awal
        list.displayElement(); // Output: 5 10 20 30 40
    }

    void displayList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}