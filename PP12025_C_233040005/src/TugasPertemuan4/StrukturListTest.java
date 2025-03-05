package TugasPertemuan4;

public class StrukturListTest {
    public static void main(String[] args) {
        System.out.println("Hasil:");

        // List a: 2.1 3.4 4.5
        StrukturList listA = new StrukturList();
        listA.addMid(2.1, 0);
        listA.addTail(3.4);
        listA.addTail(4.5);
        System.out.print("List a: ");
        listA.displayList();

        // List b: 3.4 2.1 1.1 1.4 5.5
        StrukturList listB = new StrukturList();
        listB.addHead(3.4);
        listB.addMid(2.1, 1);
        listB.addMid(1.1, 2);
        listB.addMid(1.4, 3);
        listB.addTail(5.5);
        System.out.print("List b: ");
        listB.displayList();
    }
}