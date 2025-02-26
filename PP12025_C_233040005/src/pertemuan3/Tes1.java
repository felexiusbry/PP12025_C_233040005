package pertemuan3;

public class Tes1 {
    public static void main(String[] args) {
        StrukturList list1 = new StrukturList();
        list1.addTail(3);
        list1.addTail(2);
        list1.addTail(1);

        System.out.print("a : ");
        list1.displayElement();
        System.out.println();

        StrukturList list2 = new StrukturList();
        list2.addTail(1);
        list2.addTail(4);
        list2.addTail(5);
        list2.addTail(7);

        System.out.print("b : ");
        list2.displayElement();
        System.out.println();
    }
}
